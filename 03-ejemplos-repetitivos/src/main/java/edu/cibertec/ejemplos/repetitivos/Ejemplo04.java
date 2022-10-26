package edu.cibertec.ejemplos.repetitivos;

import java.util.Scanner;

public class Ejemplo04 {
    /**
     * Vamos a leer un numero que represente el dia de la semana
     * en que estamos y vamos a imprimir los dias de la semana en que
     * han pasado (1 - 7)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el dia de la semana en que se encuentra: ");
        int diaIngresado = scanner.nextInt();
        scanner.close();
        //Voy a iterar desde el 1 hasta el 7 y si detecto el dia que ingreso corto el bucle.
        for (int i = 1; i <=7; i++){
            System.out.println("Dia: " + i);
            if (i == diaIngresado){
                System.out.println("Hoy es el dia: " + i);
                break;
            }
        }

    }
}
