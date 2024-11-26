package com.poo.ciclowhile;

public class CicloWhileIf {
    public static void main(String[] args) {
        int i = 1;//Inicio
        float ahorro = 0;
        float cantidad = 10;
        boolean continuar = true;

        while (continuar){

            if(i<=52){
                ahorro += cantidad;
                System.out.println("Semana " + i + " Ahorro: " + ahorro);
                cantidad +=10;
                i++;
            } else {
                System.out.println("Haz parado el ciclo while..");
                continuar = false;
            }

        }

        System.out.println("Ahorro en 52 semanas es: " + ahorro);

    }
}
