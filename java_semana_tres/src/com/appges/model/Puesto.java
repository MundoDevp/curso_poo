package com.appges.model;

public class Puesto {
    //Atributos encapsulados
    private long codigo;
    private String nombre;
    private float sueldo;

    //Contructores
    public Puesto(){//Constructor vacio

    }

    public Puesto(long codigo,String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Puesto(String nombre){
        this.nombre = nombre;
    }

    public Puesto(String nombre,float sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Puesto(long codigo,String nombre,float sueldo){
        this.codigo =  codigo;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    //Metodos get y set
    public long getCodigo(){
        return codigo;
    }

    public void setCodigo(long codigo){
        this.codigo =  codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    //toString --Para impresion de un objeto


    @Override
    public String toString(){
        String informacion = "***Informacion del Puesto***\n";
        informacion = informacion + "Codigo: " + codigo + "\n";
        informacion += "Nombre: " + nombre + "\n";
        informacion+= "Sueldo: " + sueldo;

        return informacion;
    }
}
