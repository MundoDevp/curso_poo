package com.utelmx.poo;

import java.util.Scanner;

public class AppGestionPersonas {
    public static  void main(String args [])  {
        Persona miguel = new Persona();//Creacion de objetos a partir de la clase Persona
        Persona jesus =  new Persona();
        Persona paty = new Persona();
        Persona cesar =  new Persona();
        Scanner entrada = new Scanner(System.in);

        //Asginacion de datos a los atributos del objeto creado
        paty.nombre = "Patricia";
        paty.peso = 75.3f;
        paty.altura = 1.54f;
        paty.credito = true;

        //Asignacion de datos desde el teclado
        System.out.println("Ingresar su nombre completo");
        miguel.nombre = entrada.nextLine();//cadena
        System.out.println("Ingresar su peso en valor numerico");
        miguel.peso = Float.parseFloat(entrada.nextLine());
        System.out.println("Ingresar su altura");
        miguel.altura = Float.parseFloat(entrada.nextLine());
        System.out.println("Desea un credito?");
        miguel.credito = Boolean.parseBoolean(entrada.nextLine());

        miguel.imprimir();
        jesus.imprimir();
        paty.imprimir();
        cesar.imprimir();

    }
}
