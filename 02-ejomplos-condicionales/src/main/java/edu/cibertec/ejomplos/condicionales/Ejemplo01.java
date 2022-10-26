package edu.cibertec.ejomplos.condicionales;

import java.util.Scanner;

public class Ejemplo01 {
    public static void main(String[] args) {
        //leer una edad desde el teclado y determinar
        //si es mayor o no
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa tu edad: ");
        int edad = scanner.nextInt();
        scanner.close();
        if (edad < 0 ){
            System.out.println("la edad no es valida");
            return;
        }
        //vamos a determinar si es mayor de edad

        if (edad >= 18){
            System.out.println("el usuario es mayor de edad");
        }else {
            System.out.println("el usuario es menor de edad");
        }

    }
}
