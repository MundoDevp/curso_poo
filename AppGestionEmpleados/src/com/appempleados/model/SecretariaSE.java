package com.appempleados.model;

public class SecretariaSE {
    private long id;
    private String nombre;
    private String correo;
    private char genero;
    private String direccion;
    private String telefono;
    private float sueldoSemanal;

    public SecretariaSE() {
    }

    public SecretariaSE(long id, String nombre, String correo, char genero, String direccion, float sueldoSemanal) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.genero = genero;
        this.direccion = direccion;
        this.sueldoSemanal = sueldoSemanal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getSueldoSemanal() {
        return sueldoSemanal;
    }

    public void setSueldoSemanal(float sueldoSemanal) {
        this.sueldoSemanal = sueldoSemanal;
    }
}
