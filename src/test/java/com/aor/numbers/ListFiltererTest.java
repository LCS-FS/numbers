package com.aor.numbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class ListFiltererTest {
    private List<Integer> list;
    @BeforeEach
    public void helper(){
        list = Arrays.asList(1,-2, 4, 3, 10, -5);
    }

    @Test
    public void filter(){
        GenericListFilter fil = Mockito.mock(GenericListFilter.class);
        Mockito.when(fil.accept(1)).thenReturn(true);
        Mockito.when(fil.accept(-2)).thenReturn(false);
        Mockito.when(fil.accept(4)).thenReturn(true);
        Mockito.when(fil.accept(3)).thenReturn(true);
        Mockito.when(fil.accept(10)).thenReturn(true);
        Mockito.when(fil.accept(-5)).thenReturn(false);
        ListFilterer listFilterer = new ListFilterer(fil);

        List<Integer> filtered_list = listFilterer.filter(list);

        Assertions.assertEquals(Arrays.asList(1, 4, 3, 10), filtered_list);
    }
}
