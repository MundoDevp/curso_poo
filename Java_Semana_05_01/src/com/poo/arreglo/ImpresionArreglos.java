package com.poo.arreglo;

public class ImpresionArreglos {
    public static void main(String[] args) {
        //Sintaxis de un arreglo

        int [] calificaciones =  new int[5];

        //Asignacion de datos a las posiciones del arreglo
        calificaciones[0] = 8;
        calificaciones[1] = 5;
        calificaciones[2] = 6;
        calificaciones[3] = 5;
        calificaciones[4] = 10;


        //Impresion de un arreglo por medio de un for
        for(int i = 0;i<calificaciones.length;i++){
            System.out.println(calificaciones[i]);
        }

        //Contar alumnos reprobados de poo
        int contarReprobado = 0;

        for(int i = 0; i<calificaciones.length;i++ ){
            if(calificaciones[i] < 6)
                contarReprobado++;
        }

        System.out.println("Alumnos reprobados: " + contarReprobado);

        for(int i = 0; i<calificaciones.length;i++ ){
            if(calificaciones[i] < 6)
                calificaciones[i] += 1;
        }

        //Impresion de un arreglo por medio de un for
        for(int i = 0;i<calificaciones.length;i++){
            System.out.println(calificaciones[i]);
        }



    }
}
