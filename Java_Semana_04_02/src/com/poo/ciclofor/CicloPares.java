package com.poo.ciclofor;

public class CicloPares {
    public static void main(String[] args) {

        //Contar cuantos numeros son pares de la siguiente serie de numeros del 1 al 35

        int cantPares=0;

        for(int i = 1; i <= 35; i++){
            if(i%2 == 0)
            {
                System.out.println("Par encontrado: " + i);
                cantPares++;
            }

        }

        System.out.println("Cantidad de Números Pares es: " + cantPares);

    }
}
