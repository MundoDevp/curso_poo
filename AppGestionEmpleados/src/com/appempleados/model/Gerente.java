package com.appempleados.model;

public class Gerente extends Empleado {
    private String departamento;
    private float pagoXdia;

    public Gerente(long id,String nombre,String correo, char genero,String departamento,float pagoXdia){
        super(id, nombre, correo, genero);
        this.departamento = departamento;
        this.pagoXdia = pagoXdia;

    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getPagoXdia() {
        return pagoXdia;
    }

    public void setPagoXdia(float pagoXdia) {
        this.pagoXdia = pagoXdia;
    }

    @Override
    public String toString() {
        String infoGerente = super.toString();
        infoGerente+= "Departamento: " + departamento + "\n";
        infoGerente+= "Pago X día: " + pagoXdia + "\n";

        return infoGerente;
    }
}
