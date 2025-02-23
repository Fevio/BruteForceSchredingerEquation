package com.bruteForceSchredinger.app.functions;

import java.util.ArrayList;

public class CostantFunction extends Function{

    int costant;
    public CostantFunction(int costant){
        this.costant = costant;
    }

    @Override
    protected Function getDerivative(ArrayList<String> variables) {
        return new CostantFunction(0);
    }

    @Override
    public String getString() {
        return String.valueOf(costant);
    }
}
