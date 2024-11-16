package com.utelmx.poo_2;

public class Producto {
    long codigo;
    String nombre;
    float costoVenta;
    float costoCompra;

    //Constructor
    public Producto(){

    }

    public Producto(String nombre){
        this.nombre = nombre;

    }

    public Producto(String nombre,float costoCompra){
        this.nombre =  nombre;
        this.costoCompra = costoCompra;
    }

}
