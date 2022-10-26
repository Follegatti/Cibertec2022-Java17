package edu.cibertec.ejemplos.basicos;


public class QuintoPrograma {
    public static void main(String[]args){
        //inmutabilidad en string
        String nombre = "Goku";
        String otroNombre = "Goku";

        String tercerNombre = new String("Goku");
        //vamos a ver el tema de referencias
        System.out.println(nombre == otroNombre );
        //ahora vemaos el tercer nombre
        System.out.println(nombre==tercerNombre);
        //un mecanisnmo de string que nos permite comparar el texto
        System.out.println(nombre.equals(tercerNombre));
    }


}
