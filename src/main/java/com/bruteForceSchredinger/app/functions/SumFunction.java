package com.bruteForceSchredinger.app.functions;

import java.util.ArrayList;

public class SumFunction extends Function {

    ArrayList<Function> functions = new ArrayList<>();

    public SumFunction(ArrayList<Function> functions) {
        this.functions = functions;
    }

    @Override
    public Function getDerivative(ArrayList<String> variables) {
        ArrayList<Function> sumFunctionsDerivatives = new ArrayList<>();
        for (Function function : functions) {
            sumFunctionsDerivatives.add(function.getDerivative(variables));
        }
        return new SumFunction(sumFunctionsDerivatives);
    }

    @Override
    public String getString() {
        String functionString = "";
        for (int i = 0; i < functions.size(); i++) {
            Function function = functions.get(i);
            if (i < functions.size() - 1) {
                functionString = functionString + function.getString() + " + ";
            } else {
                functionString = functionString + function.getString();
            }
        }
        return functionString;
    }
}
