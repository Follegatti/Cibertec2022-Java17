package edu.cibertec.ejemplos.repetitivos;

import java.util.Scanner;

public class Ejemplo02 {
    public static void main(String[] args) {
        /**
         * Vamos a solicitar la nota de un alumno
         * Si la nota es negativa o excede a 20, debemos solicitar nuevamente
         */
        //1. Decalro una variable para guardar la nota
        double nota;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Ingrese la nota del alumno: ");
            nota = scanner.nextDouble();

        }while (nota < 0 || nota > 20);
        scanner.close();
        System.out.println("La nota del aulmno es: " + nota);

    }
}
