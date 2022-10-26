package edu.cibertec.ejemplos.repetitivos;

import java.util.Scanner;

public class Ejemplo03 {
    public static void main(String[] args) {
        /**Invertir un numero
         *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero que quiere invertir: ");
        int numero = scanner.nextInt();
        scanner.close();
        // empieza el proceso de descompocicion
        //Declaro dos variables: un auxiliar que guarde ul ultimo digito
        //y otro que guarde el nunmero invertido final
        int auxiliar, numeroInvertido = 0;
        while (numero > 0){
            auxiliar = numero % 10;
            numeroInvertido =  numeroInvertido * 10 + auxiliar;
            numero = numero / 10;
        }
        System.out.println("El numero invertido es: " + numeroInvertido);
    }
    public static int invertirNumero(int numero){

        return numero;
    }
}
