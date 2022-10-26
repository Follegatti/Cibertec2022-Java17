package edu.cibertec.ejomplos.condicionales;

import java.util.Scanner;

public class EjercicioCondicionales {
    /**
     * Elaborar una aplicación Java de consola que permita calcular el sueldo total de un empleado de TI basado en los siguientes datos:
     *
     *  - Horas (número entero)
     * - Tarifa (número real)
     * - Seniority (texto o carácter con los valores: J (Junior), M (Mid-Senior), S (Senior), L (Lead)
     *
     * El cálculo del sueldo base será horas x tarifa
     * Se hará un descuento considerando lo siguiente:
     *     - Si el sueldo base excede los 1100.0 soles, se hará un descuento del 5%
     *     - Si el sueldo base excede los 2500.0 soles, se hará un descuento del 8%
     *     - Si el sueldo base excede los 5000.0 soles, se hará un descuento del 12%
     *     - Si el sueldo supera los 8000.0 soles, se hará un descuento del 17%
     *
     * Se hará una bonificación dependiendo del seniority del empleado:
     *     - Si es Junior, se le dará un bono de 100.0 soles
     *     - Si es Mid-Senior, se le dará un bono de 150.0 soles
     *     - Si es Senior, se le dará un bono de 200.0 soles
     *     - Si es Lead, se le dará un bono de 450.0 soles
     *
     * El sueldo total es el resultado de aplicarle el descuento y el bono al sueldo base.
     */
    public static void main(String[] args) {
    //Declaracion de variable
        int horas;
        double tarifa, sueldoBase, descuento, bonificacion, sueldoTotal;
        String seniority;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la horas: ");
        horas = scanner.nextInt();
        System.out.println("Ingrese las tarifa: ");
        tarifa = scanner.nextDouble();
        System.out.println("Ingrese el nivel de Seniority: ");
        seniority = scanner.next();
        scanner.close();

        //proceso de calculo
        sueldoBase = calcularSueldoBase( horas, tarifa);
        descuento = calcularDescuento(sueldoBase);
        bonificacion = calcularBonificacion(seniority);
        sueldoTotal = sueldoBase - descuento + bonificacion;
        System.out.println("El sueldo base es de: " + sueldoBase);
        System.out.println("El  descuento es de: " + descuento);
        System.out.println("La bonificacion es de: "+ bonificacion);
        System.out.println("su sueldo total es de: " + sueldoTotal);
    }
    public static double calcularSueldoBase(int horas ,double tarifa){
        return horas * tarifa;
    }
    public static double calcularDescuento(double sueldoBase){
        double montoDescuento =0.0;
        if (sueldoBase > 1100 && sueldoBase <= 2500){
            montoDescuento = sueldoBase * 0.05;
        }
        else if (sueldoBase > 2500 && sueldoBase <=5000){
            montoDescuento = sueldoBase * 0.08;
        }
        else if (sueldoBase > 500 && sueldoBase <= 8000){
            montoDescuento = sueldoBase * 0.12;
        }
        else if(sueldoBase > 8000){
            montoDescuento = sueldoBase * 0.17;
        }
        return montoDescuento;
    }
    public static double calcularBonificacion(String seniority){
        double bonificacion = 0.0;
        switch (seniority){
            case "J", "j" -> bonificacion = 100;
            case "M", "m" -> bonificacion = 150;
            case "S", "s" -> bonificacion = 200;
            case "L", "l" -> bonificacion = 450;
        }
        return bonificacion;
    }
}
