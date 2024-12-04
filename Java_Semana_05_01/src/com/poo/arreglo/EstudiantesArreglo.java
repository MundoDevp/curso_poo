package com.poo.arreglo;

public class EstudiantesArreglo {
    public static void main(String[] args) {
        Estudiante [] lista = new Estudiante[3];

        imprimir(lista);

        lista [0] = new Estudiante(562423,"Alfonso Gutierrez",5f);
        lista [1] = new Estudiante(562478,"Luis Martinez",5f);
        lista [2] = new Estudiante(562471,"Jose Hernandez",9.3f);
        imprimir(lista);
        obtenerReprobados(lista);
        revertirImpresion(lista);

    }

    public static void imprimir(Estudiante[] arreglo){
        for (int i=0; i< arreglo.length;i++){
            System.out.println(arreglo[i]);
        }
    }

    public static void obtenerReprobados(Estudiante[] arreglo){
        for (int i=0; i< arreglo.length;i++){

            if(arreglo[i].getPromedio()<6)
                System.out.println(arreglo[i].getNombre());
        }
    }

    public static void revertirImpresion(Estudiante[]arreglo){
        for(int i = arreglo.length-1;i>=0; i--){
            System.out.println(arreglo[i]);
        }
    }

}
