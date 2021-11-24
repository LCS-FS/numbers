package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter{
    private int divisor;
    public DivisibleByFilter(int number){
        divisor = number;
    }
    @Override
    public boolean accept(Integer number){
        if((number % divisor) == 0) return true;
        return false;
    }
}
