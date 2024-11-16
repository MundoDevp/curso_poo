package com.utelmx.poo_2;

public class Calculadora {
    //Atributos
    float numeroUno;
    float numeroDos;

    //Metodos que retorna valor despues de su operacion
    public float sumar(){
        return numeroUno + numeroDos;
    }

    public float restar(){
        return numeroUno - numeroDos;
    }

    public float dividir(){
        return  numeroUno/numeroDos;
    }

    public float multiplicar(float numeroUno, float numeroDos){
        return numeroUno * numeroDos;
    }


}
