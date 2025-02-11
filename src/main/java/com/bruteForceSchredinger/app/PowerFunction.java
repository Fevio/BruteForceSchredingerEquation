package com.bruteForceSchredinger.app;

public class PowerFunction extends Function{

    Function baseFunction;
    Function exponentialFunction;

    public PowerFunction(Function baseFunction,Function exponentialFunction){
        this.baseFunction = baseFunction;
        this.exponentialFunction = exponentialFunction;
    }

    @Override
    void derivate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'derivate'");
    }
    
}
