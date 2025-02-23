package com.bruteForceSchredinger.app.functions;

import java.util.ArrayList;
import java.util.Collections;

public class LinearFunction extends Function{

    String variable;
    public LinearFunction(String variable){
        this.variable = variable;
    }

    @Override
    public Function getDerivative(ArrayList<String> variables) {
        for(String variable : variables){
            if(variable.equals(this.variable)){
                return new CostantFunction(1);
            }
        }
        return new CostantFunction(0);
    }

    @Override
    public String getString() {
        if(getCompositeFunction() != null){
            return variable + getCompositeFunction().getString();
        }else{
            return variable;
        }
    }
}
