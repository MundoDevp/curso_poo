package com.utelmx.poo_2;

import java.util.Scanner;

public class AppCalculadora {
    public static  void main(String args[]){
        Calculadora calmiguel =  new Calculadora();
        Scanner entrada =  new Scanner(System.in);

        System.out.println("Bienvenido a nuestra calculadora de Miguel");
        System.out.println("**********************************");
        System.out.println("Ingresar el primer valor:");
        calmiguel.numeroUno = Float.parseFloat(entrada.nextLine());
        System.out.println("Ingresar el segundo valor:");
        calmiguel.numeroDos = Float.parseFloat(entrada.nextLine());

        //Salidas

        System.out.println("La suma de Numero Uno y dos es: " +  calmiguel.sumar());
        System.out.println("La resta de Numero Uno y dos es: " +  calmiguel.restar());
        System.out.println("La division de Numero Uno y dos es: " +  calmiguel.dividir());
        System.out.println("La multiplicacion de Numero Uno y dos es: " +  calmiguel.multiplicar(calmiguel.numeroUno,calmiguel.numeroDos));

    }
}
