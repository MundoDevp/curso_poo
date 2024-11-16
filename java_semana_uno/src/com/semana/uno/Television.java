package com.semana.uno;

public class Television{
    //Atributos
    int codigo;
    String marca;
    String modelo;
    float pulgadas;
    float precio;

    //Métodos o acciones
    public void encender(){
       System.out.println("com.semana.uno.Television encendida...");//Impresion de informacion
    }

    public void apagar(){
        System.out.println("com.semana.uno.Television apagada...");
    }

    public void imprimir(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Pulgadas: " + pulgadas);
        System.out.println("Precio: " + precio);
    }



}
