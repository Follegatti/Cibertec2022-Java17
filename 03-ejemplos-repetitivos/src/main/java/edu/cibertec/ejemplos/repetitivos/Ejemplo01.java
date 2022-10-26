package edu.cibertec.ejemplos.repetitivos;

import java.util.Scanner;

public class Ejemplo01 {

    public static void main(String[] args) {
        //Imprimir simplemente del 1 a un número que ingresen por el teclado.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numeroLimite  = scanner.nextInt();//10
        scanner.close();
        //Sintaxis del WHILE
        int contador = 1;

        while (contador <=numeroLimite){
            System.out.println(contador);
            //contador = condaor + 1;
            //contador +=  1;
            contador++;
        }
        //sintaxis con DO WHILE
        int aux = numeroLimite;
        System.out.println("Imprimimos de reverza con Do While");
        do {
            System.out.println(aux);
            aux--;
        }while (aux > 0);

        //Sintaxis con el for iterativo
        System.out.println("=====Imprimiendo con for iterativo====");
        for (int i = 1; i<numeroLimite;i++){
            System.out.println(i);
        }
    }
}
