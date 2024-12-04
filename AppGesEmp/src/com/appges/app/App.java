package com.appges.app;
import com.appges.model.Puesto;
import com.appges.model.Empleado;

public class App {
    public static void main(String[] args) {
        Puesto programador = new Puesto();
        Puesto diseniador = new Puesto(10002,"Diseñador Grafico",1200);

        programador.setCodigo(10001);
        programador.setNombre("Programador");
        programador.setSueldo(1500);
        System.out.println(programador);
        System.out.println(diseniador);

        ///Seccion de Empleados
        Empleado alfonso = new Empleado();
        Empleado miguel = new Empleado(50006,"Rodrigo Murrieta","5874125126","rodrimur@gmail.com",programador);
        alfonso.setDni(50001);
        alfonso.setNombre("Alfonso Hernandez");
        alfonso.setTelefono("5527894218");
        alfonso.setCorreo("alfonsohrdz@gmail.com");
        alfonso.setPuesto(diseniador);

        //Impresion
        System.out.println(alfonso);
        System.out.println(miguel);

    }
}
