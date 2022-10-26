package edu.cibertec.ejomplos.condicionales;

import java.util.Scanner;

public class Ejemplo04 {
    public static void main(String[] args) {
        /**    Ingresar la incial del modo de transmicion
         * de un automovil: M(mecanico), S(secuencial),
         * A(automatico).
          */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de tranmisión: ");
        char transmision = scanner.next().charAt(0);
        scanner.close();

        switch (transmision){
            case 'M' :
            case 'm' :
                System.out.println("transmicion mecánica");
                break;
            case  'S':
            case  's':
                System.out.println("transmision secuencial");
                break;
            case 'A':
            case 'a':
                System.out.println("transmision automatica");
                break;
            default:
                System.out.println("no es una transmision valida");


        }
    }
}
