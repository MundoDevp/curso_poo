package com.utelmx.poo;

public class Persona {
    //Atributos
    String nombre;
    float peso;
    float altura;
    boolean credito;


    //Metodos
    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Peso: " + peso);
        System.out.println("Altura:" + altura);
        System.out.println("Credito: " +  credito);
        System.out.println("-----------------------------------");
    }

}
