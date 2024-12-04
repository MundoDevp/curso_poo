package com.appempleados.model;

public class Empleado {
    protected long id;
    protected String nombre;
    protected String correo;
    protected char genero;

   public Empleado(long id, String nombre, String correo, char genero) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.genero = genero;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {

        String infoBasica = "";
        infoBasica += "Clave empleado: " + id + "\n";
        infoBasica += "Nombre: " + nombre + "\n";
        infoBasica += "Correo: " + correo + "\n";
        infoBasica += "Genero: " + genero + "\n";
        return infoBasica;
    }
}
