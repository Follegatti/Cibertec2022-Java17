package edu.cibertec.ejemplos.basicos;

public class SextoPrograma {
    public static void main(String[] args) {
        //vamos a interectuar con StringBuilder y StringBuffer

        //Empezamos con StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bienvenido al curso de Java 17");
        stringBuilder.append("\n");
        stringBuilder.append("Esta es la tercera secion.");
        System.out.println(stringBuilder);

       StringBuilder palindromo = new StringBuilder("hola mundo");
       String palabraInvertida = palindromo.reverse().toString();
        System.out.println("la palabra invertida es: " + palabraInvertida);
    }
}
