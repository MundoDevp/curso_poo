package com.appestudiantes.bl;

public class Gestion {

    public static float promediarXalumno(float [][] calificaiones,int alumno){
        float calificacion = 0;

        for(int columna = 0; columna<calificaiones[alumno].length;columna++){
            calificacion+= calificaiones[alumno][columna];
        }

        return calificacion/calificaiones[alumno].length;
    }

    public static void llenarPromedios(float calificaciones[][],float [] promedios){
        for(int fila = 0; fila < calificaciones.length;fila++){
            promedios[fila] = promediarXalumno(calificaciones,fila);
        }
    }

    public static  String imprimir(float [][] calificaciones){
        String listaCalificaciones = "";

        for(int fila=0;fila<calificaciones.length;fila++){
            for(int columna=0; columna < calificaciones[fila].length;columna++){
                listaCalificaciones += calificaciones[fila][columna] + "\t";
            }
            listaCalificaciones+="\n";
        }
        return listaCalificaciones;
    }

    public static String imprimir(float [] promedios){
        String listaPromedios = "";

        for (int i = 0; i<promedios.length;i++)
        {
           listaPromedios += promedios[i] + "\n";
        }

        return listaPromedios;
    }




}
