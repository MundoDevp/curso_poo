package com.poo.ciclofor;

public class CicloFor {
    public static void main(String[] args) {

        int indice = 0;

        for(int i=1; i < 15; i++){
            System.out.println("Hola desde la iteracion: " + i);
            indice = i;
        }
        System.out.println("Valor real");
        System.out.println("Valor final de i:" + indice);

        System.out.println("Ciclo for finalizado..");



    }
}
