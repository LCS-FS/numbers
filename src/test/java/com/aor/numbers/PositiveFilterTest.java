package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PositiveFilterTest {
    int number1, number2, number3;
    @BeforeEach
    public void helper(){
        number1 = 10;
        number2 = -10;
        number3 = 0;
    }
    @Test
    public void pos_fil_test(){
        PositiveFilter positiveFilter = new PositiveFilter();
        boolean pos = positiveFilter.accept(number1);
        boolean neg = positiveFilter.accept(number2);
        boolean zero = positiveFilter.accept(number3);

        Assertions.assertEquals(pos, true);
        Assertions.assertEquals(neg, false);
        Assertions.assertEquals(zero, false);
    }
}
