package com.poo.ciclowhile;

public class CicloWhile {
    public static void main(String[] args) {


        int i = 1;//Inicio
        float ahorro = 0;
        float cantidad = 10;

        while (i<=52){
            ahorro += cantidad;
            System.out.println("Semana " + i + " Ahorro: " + ahorro);
            cantidad +=10;
            i++;
        }

        System.out.println("Ahorro en 52 semanas es: " + ahorro);

    }
}
