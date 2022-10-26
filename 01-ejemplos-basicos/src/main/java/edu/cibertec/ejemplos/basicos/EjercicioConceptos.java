package edu.cibertec.ejemplos.basicos;

import java.util.Locale;
import java.util.Scanner;

/**
 * <b>Este archivo desarrolla un ejercicio con los temas basicos </b>
 * Ejerccio
 */
public class EjercicioConceptos {
    public static void main(String[] args) {
        System.out.println("Programa de conversion de monedas");
        /*leer datos desde el teclado: nombre apellido, edad, monto a cambiare
        El progrma debe imprimir un nombre  de usuario generado
        primera letra del nombre, apellido completo, cuatro ultimos digitos del dni(minusculas)
        ejem: Marcelo Trataje 12345678 -> mtataje5678
        e imprimir el monto cambiado utilizando como dato, t.c = 3.98
        -> para leer datos del tteclado usamos scanner
         */
        Scanner lector = new Scanner(System.in);
        //Aquí hare la lectura
        System.out.println("Ingrese el nombre del Cliente: ");
        String nommbre = lector.next();
        System.out.println("Ingrese el Apellido: ");
        String apellido = lector.next();
        System.out.println("Ingrese el DNI: ");
        String dni = lector.next();
        System.out.println("Ingrese la Edad: ");
        int edad = lector.nextInt();
        System.out.println("Ingrese el monto a cambiar: ");
        double monto = lector.nextDouble();
        lector.close();
        //Empezamos con el procesos de datos
        char primerlaaLetra = nommbre.charAt(0);
        String ultimosDigitos = dni.substring(4);
        String nombreUsuario = (primerlaaLetra + apellido + ultimosDigitos).toLowerCase();
       // String nombreUsuario = (nommbre.charAt(0) + apellido + dni.substring(4) ).toLowerCase();
        System.out.println("Usuario Generado: " + nombreUsuario);
        double montoCambiado = monto / 3.98;
        String mensajeCambio = String.format("El monoto recibido en dolares es: %.2f", montoCambiado);
        System.out.println(mensajeCambio);

    }

}
