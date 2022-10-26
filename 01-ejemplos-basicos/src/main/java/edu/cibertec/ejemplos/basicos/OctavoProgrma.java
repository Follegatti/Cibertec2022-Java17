package edu.cibertec.ejemplos.basicos;

public class OctavoProgrma {

    public static void main(String[] args) {
        String textoMultilinea = """
                Bienvenidos al curso de Java 17 Fundamentals
                Tercera secion
                Lenguaje favoritos: Java , JavaScript, VisualBasic
                Setup: i7 9gen  SSD:1TB
                """;
        System.out.println(textoMultilinea);

        //Podemos definir un texto con formato
        String nombre =  "Enrique";
        int edad = 28;
        double salario = 2800;
        String dni = "48126796";
        //Imprimir los datos en un formato bonito
        System.out.println("===========================================");
        String textoConFormato = """
                Hola, soy %s
                tengo %d años
                Percibo: %.2f
                Documento de identidad: %s
                """.formatted(nombre,edad,salario,dni);
        System.out.println(textoConFormato);
    }
}
