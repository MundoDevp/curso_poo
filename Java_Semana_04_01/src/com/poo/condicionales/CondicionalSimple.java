package com.poo.condicionales;

public class CondicionalSimple {
    public static void main(String[] args) {
        //Condicionales Operadores realacionales < > <= >= !=

        //Programa para saber si un numero es positivo

        int numero = -5;
        boolean resultado = numero > 0;

        if (resultado)
            System.out.println("El numero " + numero + " es positivo.");
        else
            System.out.println("El numero " + numero + " es negativo.");

    }


}
