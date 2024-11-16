package com.utelmx.poo_2;

public class Iva {

    float cantidad;

    public float calcularImpuestoECU(){
        return cantidad * .15f;
    }

    public float calcularImpuestoMX(){
        return cantidad * .16f;
    }

    public float calculcularImpuestoESP(){
        return cantidad * .21f;
    }

    public  float calcularImpuestoW(){
        return cantidad * .11f;
    }

    public float calcularImpuestoCalf(){
        return cantidad * .04f;
    }
}
