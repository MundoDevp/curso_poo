package com.poo.condicionales;

public class PagarSueldo {
    public static void main(String[] args) {
        float sueldo = 3000;
        float cantidadMaxima = 2000;
        float descuento = 0;  // sueldo * .12;
        float sueldoNeto = 0; // sueldo - descuento


        if(sueldo >= cantidadMaxima){
            descuento = sueldo * .12f;
            sueldoNeto = sueldo - descuento;

        }else{
           sueldoNeto =  sueldo;
        }

        System.out.println("****Sueldo del emprelado****\n");
        System.out.println("Sueldo: "  + sueldo);
        System.out.println("Descuento: " + descuento);
        System.out.println("Sueldo Neto: " + sueldoNeto);

    }

}
