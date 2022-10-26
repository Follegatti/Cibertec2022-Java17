package edu.cibertec.ejomplos.condicionales;

import java.util.Scanner;

public class Ejemplo02 {
    public static void main(String[] args) {
        //leer una edad desde el teclado y determinar
        //si es mayor o no
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa tu edad: ");
        int edad = scanner.nextInt();
        scanner.close();
        if (edad < 0 || edad > 100){
            System.out.println("la edad no es valida");
            return;
        }
        //vamos a determinar si es mayor de edad
        String msjSalida = edad > 18 ? "Es mayor de edad" : "Es menor de edad";
        System.out.println(msjSalida);
        //System.out.println(edad > 18 ? "Es mayor de edad" : "Es menor de edad");

    }
}
