package com.poo.ciclofor;

public class CicloForAnidado {
    public static void main(String[] args) {

        //Tablas de multiplicar

        System.out.println("***************************");
        System.out.println("***Tablas de multiplicar***");
        System.out.println("***************************");
        for(int tabla = 1;tabla<=10;tabla++){//Tabla

            for(int numero = 1;numero<=10;numero++){//Numero del 1 al 10
                System.out.println( tabla + " x " + numero + " = " + (tabla * numero) );
            }

        }

        System.out.println("Gracias por usar nuestra aplicacion de tablas..");
        System.out.println("Adios..");

    }
}
