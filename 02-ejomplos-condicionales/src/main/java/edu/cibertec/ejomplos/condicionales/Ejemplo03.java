package edu.cibertec.ejomplos.condicionales;

import java.util.Scanner;

public class Ejemplo03 {
    /**    Vamos aa leer la inicial de un S.O
     * y vamos a imprimir su nombre completo
     * w = windows , L = Linux , M = Mac OS , C = Chrome OS
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la Inicial de un Sistema Operativo: ");
        String inicialSO = scanner.next();
        scanner.close();

        //vamos a proceder a evaluar la inicial
        if (inicialSO.equalsIgnoreCase("W")){
            System.out.println("el Sistema Operativo es Windows");
        } else if (inicialSO.equalsIgnoreCase("L")){
            System.out.println(" el Sistema Oprativo es Linux");
        } else if (inicialSO.equalsIgnoreCase("M")){
             System.out.println("El sistema Operativo es Mac OS");
        } else if (inicialSO.equalsIgnoreCase("C")){
             System.out.println("El sistema Operativo es Chrome OS");
        } else {
             System.out.println("la letra no es valida");
         }
    }
}
