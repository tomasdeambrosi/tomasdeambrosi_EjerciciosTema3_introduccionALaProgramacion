package com.example;

// - Crear una función con tres parámetros que sean números que se suman entre sí.
// - Llamar a la función en el main y darle valores.

public class PrimeraParte {

    public static void main(String[] args) {

        System.out.println((suma(10,20,30)));
        System.out.println((suma(2,500,30000)));
        System.out.println((suma(1,235,135)));
    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }


}
