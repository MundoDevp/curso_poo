package com.appempleados.model;

public class DesarrolladorSE {
    private long id;
    private String nombre;
    private String correo;
    private char genero;
    private String direccion;
    private String telefono;
    private String lenguaje;
    private float costoH;
    private float horasT;

    public DesarrolladorSE() {
    }

    public DesarrolladorSE(float horasT, float costoH, String lenguaje, String direccion, char genero, String correo, String nombre, long id) {
        this.horasT = horasT;
        this.costoH = costoH;
        this.lenguaje = lenguaje;
        this.direccion = direccion;
        this.genero = genero;
        this.correo = correo;
        this.nombre = nombre;
        this.id = id;
    }
}
