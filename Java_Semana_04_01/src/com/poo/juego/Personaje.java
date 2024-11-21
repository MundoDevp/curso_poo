package com.poo.juego;

public class Personaje {

    private String nombre;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Acciones de personaje
    public void brincar(){
        System.out.println("Brincando...");
    }

    public void avanzar(){
        System.out.println("Caminando hacia adelante..");
    }
    public void retroceder(){
        System.out.println("Caminando hacia atras");
    }

    public void parar(){
        System.out.println("Parado");
    }


}
