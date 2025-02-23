package com.bruteForceSchredinger.app.functions;

import java.util.ArrayList;

public class ProductFunction extends Function {

    ArrayList<Function> functions = new ArrayList<>();

    public ProductFunction(ArrayList<Function> functions) {
        // Caso in cui Una funzione moltiploia una funzioen prodotto, le merga
        for (Function function : functions) {
            if (!function.getString().equals("1")) {
                if (function instanceof ProductFunction) {
                    for (Function fun : ((ProductFunction) function).getFunctions()) {
                        this.functions.add(fun);
                    }
                } else {
                    this.functions.add(function);
                }
            } 
        }
    }

    // d f(x)f(x)f(z) = f'(x)f(x)f(z) + f(x)*f'(x)f(z) + f(x)f(x)f'(z)
    @Override
    public Function getDerivative(ArrayList<String> variables) {
        ArrayList<Function> productFunctionsDerivatives = new ArrayList<>();
        ArrayList<Function> sumFunctions = new ArrayList<>();

        for (int i = 0; i < functions.size(); i++) {
            for (int j = 0; j < functions.size(); j++) {
                if (i == j) { // Escludi l'elemento corrente
                    productFunctionsDerivatives.add(functions.get(i).getDerivative(variables));
                } else {
                    productFunctionsDerivatives.add(functions.get(i));
                }
            }
            sumFunctions.add(new ProductFunction(productFunctionsDerivatives));
            productFunctionsDerivatives = new ArrayList<>();
        }
        return new SumFunction(sumFunctions);
    }

    @Override
    public String getString() {
        String functionString = "[";
        for (int i = 0; i < functions.size(); i++) {
            Function function = functions.get(i);
            if (i < functions.size() - 1) {
                functionString = functionString + function.getString() + " * ";
            } else {
                functionString = functionString + function.getString();
            }
        }
        functionString = functionString + "]";
        return functionString;
    }

    public ArrayList<Function> getFunctions() {
        return this.functions;
    }
}
