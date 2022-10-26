package edu.cibertec.ejemplos.repetitivos;

import java.util.Scanner;

public class Ejemplo05 {
    /**
     *Voy a ingresar un numeroy voy a imprimir los numeros pares que hay
     * en el rango de 1 hasta el numero (inclusivo)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero maximo: ");
        int numeroMaximo = scanner.nextInt();
        scanner.close();
        //Utilizar un for para imprimir los numeros del rango indicado
        for (int i = 1; i <=numeroMaximo; i++){
            if (i % 2 != 0){
                continue;
            }
            System.out.println("Numero: " + i);
        }
    }
}
