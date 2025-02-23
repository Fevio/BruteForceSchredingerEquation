package com.bruteForceSchredinger.app.functions.beta;

import java.util.ArrayList;

import com.bruteForceSchredinger.app.functions.Function;

public class PowerFunction extends Function{

    Function function;
    
    public PowerFunction(Function function){
       this.function = function;
    }

    @Override
    public String getString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getString'");
    }

    @Override
    protected Function getDerivative(ArrayList<String> variables) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDerivative'");
    }
    
}
