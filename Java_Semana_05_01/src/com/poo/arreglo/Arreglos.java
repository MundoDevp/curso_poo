package com.poo.arreglo;

public class Arreglos {
    public static void main(String[] args) {
        //Sintaxis de un arreglo

        int [] calificaciones;//Definicion
        calificaciones = new int[5];//Creacion  0 - 4

        //Asignacion de datos a las posiciones del arreglo
        calificaciones[0] = 8;
        calificaciones[1] = 5;
        calificaciones[2] = 6;
        calificaciones[3] = 5;
        calificaciones[4] = 10;

        System.out.println(calificaciones[3]);//Obtener el elemento de la posicion definida
        //System.out.println(calificaciones[8]);
        //Impresion

    }
}
