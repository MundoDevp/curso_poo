package com.poo.condicionales;

public class CondicionalCompuesto {
    public static void main(String[] args) {

        long matricula = 568427;
        String clave = "563421";

        if(matricula == 568427 && clave == "563421"){
            System.out.println("Bienvenido al Sistema de ALumnos");
        }else{
            System.out.println("Matricula y/o contraseña incorrecta");
        }

    }
}
