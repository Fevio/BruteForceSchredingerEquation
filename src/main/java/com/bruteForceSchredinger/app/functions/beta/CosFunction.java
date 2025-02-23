package com.bruteForceSchredinger.app.functions.beta;

import java.util.ArrayList;

import com.bruteForceSchredinger.app.functions.Function;

public class CosFunction extends Function {
    @Override
    protected Function getDerivative(ArrayList<String> variables) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDerivative'");
    }

    @Override
    public String getString() {
        if (getCompositeFunction() != null) {
            return "cos(" + getCompositeFunction().getString() + ")";
        }
        return "";
    }

    

}
