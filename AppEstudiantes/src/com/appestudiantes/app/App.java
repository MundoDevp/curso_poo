package com.appestudiantes.app;
import com.appestudiantes.model.Estudiante;
import com.appestudiantes.bl.Gestion;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //Matriz de calificaciones
        float [][] calificaciones = new float[2][3];
        float [] promedios = new float[calificaciones.length];
        Estudiante[] estudiantes = new Estudiante[promedios.length];

       /* calificaciones[0][0] = 8.5f;
        calificaciones[0][1] = 9.5f;
        calificaciones[0][2] = 5.3f;
        calificaciones[1][0] = 7.5f;
        calificaciones[1][1] = 9.5f;
        calificaciones[1][2] = 6.3f;*/



        System.out.println(Gestion.imprimir(calificaciones));
        llenar(calificaciones);
        System.out.println(Gestion.imprimir(calificaciones));
        Gestion.llenarPromedios(calificaciones,promedios);
        System.out.println("**Impresion de promedios**");
        System.out.println( Gestion.imprimir(promedios));;


    }


    public static void llenar(float [][] calificaciones){
        Scanner entrada = new Scanner(System.in);

        for(int fila = 0;fila<calificaciones.length;fila++){
            for (int columna=0;columna<calificaciones[fila].length;columna++){
                System.out.println("Ingresar calificacion del alumno " + (fila + 1));
                calificaciones[fila][columna] = Float.parseFloat(entrada.nextLine());
            }
        }
    }


}
