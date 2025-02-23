package com.bruteForceSchredinger.app.functions;

import java.util.ArrayList;

public abstract class Function {

    private Function compositeFunction;

    public void setCompositeFunction(Function compositeFunction){
        this.compositeFunction = compositeFunction;
    }

    public Function getCompositeFunction(){
        return compositeFunction;
    }

    protected abstract Function getDerivative(ArrayList<String> variables);
    public abstract String getString();
    
}
