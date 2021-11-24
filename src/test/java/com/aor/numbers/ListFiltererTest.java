package com.aor.numbers;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class ListFiltererTest {
    private List<Integer> list;
    @BeforeEach
    public void helper(){
        list = Arrays.asList(1,2,4,2,5);
    }

}
