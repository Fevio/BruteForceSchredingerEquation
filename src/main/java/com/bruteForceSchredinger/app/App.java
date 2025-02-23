package com.bruteForceSchredinger.app;

import com.bruteForceSchredinger.app.functions.SinFunction;
import com.bruteForceSchredinger.app.functions.SumFunction;

import java.util.ArrayList;
import java.util.Collections;

import com.bruteForceSchredinger.app.functions.LinearFunction;
import com.bruteForceSchredinger.app.functions.ProductFunction;

public class App {
    public static void main(String[] args) {

        //Composite == funzione su cui opera la funzione attuale
        //Conviene metterla nel construct?

        LinearFunction linearFunction = new LinearFunction("x");
        SinFunction sinFunction = new SinFunction();
        SinFunction sinFunction1 = new SinFunction();

        SinFunction sinY = new SinFunction();
        sinY.setCompositeFunction(new LinearFunction("y"));


        ArrayList<com.bruteForceSchredinger.app.functions.Function> sumFunctions = new ArrayList<>();
        ArrayList<com.bruteForceSchredinger.app.functions.Function> productFunctions = new ArrayList<>();
        Collections.addAll(productFunctions, sinFunction1, sinY);

        ProductFunction productFunction = new ProductFunction(productFunctions);

        Collections.addAll(sumFunctions, sinFunction, productFunction);
        SumFunction sumFunction = new SumFunction(sumFunctions);
        
        sinFunction.setCompositeFunction(sinFunction1);
        sinFunction1.setCompositeFunction(linearFunction);


        
        functionStringPrinter(sumFunction);
        functionDerivatePrinter(sumFunction);

        //PowerFunction powerFunction = new PowerFunction(new MonomialFunction(1, linearFunction));
        //linearFunction.setCompositeFunction(powerFunction);


        /* 
        JFrame frame = new JFrame("Disegna Testo con Frecce");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        FunctionPanel pannello = new FunctionPanel();
        frame.add(pannello);
        frame.setVisible(true);
        */
        
    }

    public static void functionStringPrinter(SumFunction function){
        System.out.println("Funzione Iniziale: "  + function.getString());
    }

    public static void functionDerivatePrinter(SumFunction function){
        ArrayList<String> variablesToDerivate = new ArrayList<>();
        variablesToDerivate.add("x");
        //variablesToDerivate.add("y");

        System.out.println("Funzione Derivata: " + function.getDerivative(variablesToDerivate).getString());
    }
}
