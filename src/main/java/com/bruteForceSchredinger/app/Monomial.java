package com.bruteForceSchredinger.app;

public class Monomial extends Function{

    int costant;
    Function function;

    public Monomial(int costant, Function function){
        this.costant = costant;
        this.function = function;
    }

    @Override
    void derivate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'derivate'");
    }
    
}
