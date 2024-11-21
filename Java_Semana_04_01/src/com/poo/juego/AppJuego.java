package com.poo.juego;
import java.util.Scanner;

public class AppJuego {
    public static void main(String[] args) {

        Personaje mario = new Personaje("Mario Bross");
        Scanner entrada =  new Scanner(System.in);
        String menu = "***Selecciona una opcion***\n";
        menu+="1. Avanzar\n2. Retroceder\n3. Brincar\n4. Parar\n5. Terminar Juego";
        int boton=0;

        //Muestra el menu
        System.out.println(menu);
        boton = Integer.parseInt(entrada.next());

        switch (boton){
            case 1:
                mario.avanzar();
                break;
            case 2:
                mario.retroceder();
                break;
            case 3:
                mario.brincar();
                break;
            case 4:
                mario.parar();
                break;
            case 5:
                System.out.println("Hasta la proxima.");
                System.out.println("Gracias por utilizar nuestro video juego.");
                break;
            default:
                System.out.println("Es necesario solo pulsar un boton correcto dentro del menu.");

        }

    }
}
