package com.appempleados.app;
import com.appempleados.model.Empleado;
import com.appempleados.model.Gerente;

public class App {
    public static void main(String[] args) {
        Gerente empG = new Gerente(4512,"Luis Alberto","luis@gmail.com",
                'M',"Calidad",50);
        System.out.println(empG);
        System.out.println("*************************");
        empG.setDepartamento("Limpieza");
        empG.setPagoXdia(20);
        System.out.println(empG);

    }
}
