package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DivideByTest {
    int number1, number2, number3;
    @BeforeEach
    public void helper(){
        number1 = 3;
        number2 = 10;
        number3 = 2;
    }
    @Test
    public void div_by_test(){
        DivisibleByFilter divisibleByFilter = new DivisibleByFilter(number3);
        boolean fal = divisibleByFilter.accept(number1);
        boolean tru = divisibleByFilter.accept(number2);

        Assertions.assertEquals(fal, false);
        Assertions.assertEquals(tru, true);
    }
}
