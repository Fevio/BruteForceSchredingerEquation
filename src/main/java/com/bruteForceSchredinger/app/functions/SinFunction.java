package com.bruteForceSchredinger.app.functions;

import java.util.ArrayList;
import java.util.Collections;

import com.bruteForceSchredinger.app.functions.beta.CosFunction;

public class SinFunction extends Function {

    /*
     * La derivata di sin ( ) è cos ( ) => se il contenuto di sin contiene la
     * variabile rispetto a cui è deirvato
     * Altrimenti la derivata di sin ( cost/altr v == 0)
     * 
     * 
     * 
     */

    @Override
    public Function getDerivative(ArrayList<String> variables) {
        // Se la derivata non è mai stata fatta, fa la derivata

        // Fa la derivata della funz e gli rimette ciò su cui opera
        CosFunction cosFunction = new CosFunction();
        cosFunction.setCompositeFunction(getCompositeFunction());
        // Fa poi la derivata del contenuto della funzione(der composta)
        ArrayList<Function> compositeProduct = new ArrayList<>();
        Collections.addAll(compositeProduct, cosFunction, getCompositeFunction().getDerivative(variables));
        // La ritorna
        return new ProductFunction(compositeProduct);

    }

    @Override
    public String getString() {
        if (getCompositeFunction() != null) {
            return "sin(" + getCompositeFunction().getString() + ")";
        }
        return "";
    }
}
