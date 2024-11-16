package com.utelmx.poo_2;

import javax.swing.*;

public class AppProducto {
    public static void main(String[] args) {

        Producto teclado =  new Producto();
        Producto producto1 = new Producto("Mouse");
        Iva iva = new Iva();
        teclado.codigo = 452845;
        teclado.nombre = "Teclado";
        teclado.costoVenta = 50;
        iva.cantidad = teclado.costoVenta;

        teclado.costoCompra= teclado.costoVenta-iva.calcularImpuestoW() ;

        System.out.println("Costo real de producto; " + teclado.costoCompra);

        ///
        System.out.println(producto1.nombre);


    }
}
