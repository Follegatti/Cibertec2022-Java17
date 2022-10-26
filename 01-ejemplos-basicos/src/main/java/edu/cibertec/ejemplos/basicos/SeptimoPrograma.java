package edu.cibertec.ejemplos.basicos;

public class SeptimoPrograma {
    public static void main(String[] args) {
        //vamos a interectuar con StringBuffer y StringBuffer

        //Empezamos con StringBuffer
        StringBuffer StringBuffer = new StringBuffer();
        StringBuffer.append("bienvenido al curso de Java 17");
        StringBuffer.append("\n");
        StringBuffer.append("Esta es la tercera secion.");
        System.out.println(StringBuffer);

        StringBuffer palindromo = new StringBuffer("hola mundo");
        String palabraInvertida = palindromo.reverse().toString();
        System.out.println("la palabra invertida es: " + palabraInvertida);
    }
}
