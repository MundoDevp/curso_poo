package com.semana.uno;

public class Aplicacion {
    //Metodo principal que permite la ejecución de nuestra aplicacion
   public static void main(String args []){
       Television lg = new Television();
       Television sony = new Television();
       Television panasonyc = new Television();

       //Accediendo a atributos de objetos
      lg.imprimir();

      lg.codigo = 542;
      lg.marca = "LG";
      lg.modelo = "XL4";
      lg.pulgadas = 32;
      lg.precio = 150;
      System.out.println("Impresion con datos asignados");
      lg.imprimir();
   }

}
