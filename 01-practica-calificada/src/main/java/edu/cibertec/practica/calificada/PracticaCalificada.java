package edu.cibertec.practica.calificada;

import java.util.Scanner;

/**
 * Una empresa especializada en venta de ropa le pide desarrollar un programa que permita
 * calcular el monto total a pagar por una venta realizada en sus establecimientos tomando como
 * monto bruto a las unidades que se compran y el precio unitario.
 * Por ejemplo, si una prenda cuesta 5 soles y compra 5 unidades, el precio bruto sería 25 soles.
 * La empresa agrega un recargo al monto bruto por el medio de pago que se use que puede ser
 * alguno de los siguientes:
 * ----------------------------------------
 * Medio de pago                Recargo
 * Tarjeta de crédito (C)       5%
 * Yape (Y)                     2%
 * Plin (P)                     2.5%
 * Tarjeta de débito (D)        7%
 * -----------------------------------------
 * No habrá recargo si la modalidad de pago es en efectivo (E).
 * Asimismo, se agregará un descuento dependiendo de la cantidad de unidades que lleve de
 * productos.
 * --------------------------------------------------------
 * Rango                                        Descuento
 * Más de 10 productos, pero menos de 21        10%
 * Más de 20 productos, pero menos de 51        20%
 * Más de 50 productos                          25%
 * --------------------------------------------------------
 * El monto total para pagar se calculará al restar el descuento y sumar el recargo sobre el monto
 * bruto.
 * Si alguno de los datos requeridos al momento de ingreso son inválidos, deberá mostrar un
 * mensaje de error y terminar la aplicación.
 * Se le solicita imprimir: monto bruto, recargo (de ser aplicable), descuento y monto total a pagar.
 */
public class PracticaCalificada {
    public static void main(String[] args) {
        int cantidadProducto;
        double precioUnitartio , precioBruto ,montoTotal;
        String medioDePago;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de Productos: ");
        cantidadProducto = scanner.nextInt();
        if (cantidadProducto <= 0){
            System.out.println("la cantidad de productos no es valida");
            return;
        }
        System.out.println("Ingresar el precio unitario: ");
        precioUnitartio = scanner.nextDouble();
        if (precioUnitartio <= 0.0){
            System.out.println("El precio no es valio");
            return;
        }
        System.out.println("*Tarjeta de crédito (C)");
        System.out.println("*Yape (Y)");
        System.out.println("*Plin (P) ");
        System.out.println("*Tarjeta de débito (D)");
        System.out.println("*efectivo (E)");
        System.out.println("Ingrese el medio de pago: ");
        medioDePago = scanner.next();
        scanner.close();

        precioBruto = calcularPercioBruto(cantidadProducto,precioUnitartio);
        montoTotal = precioBruto +calcularRecargo(medioDePago, precioBruto) -calcularDescuento(cantidadProducto, precioBruto);
        System.out.println("El precio bruto es: " + precioBruto);
        System.out.println("El descuento es: " + calcularDescuento(cantidadProducto, precioBruto));
        if (calcularRecargo(medioDePago, precioBruto) > 0){
            System.out.println("Recargo: " + calcularRecargo(medioDePago, precioBruto));
        }else {
            System.out.println("==No posee Recargo==");
        }
        System.out.println("Monto total a pagar: " + montoTotal);
    }
    public static double calcularPercioBruto(int cantidad, double precio){
        return cantidad * precio;
    }
    public static double calcularDescuento(int cantidad, double precio){
        double descuento =0;
        if (cantidad > 10 && cantidad <=20){
            descuento = precio * 0.1;
        }
        else if(cantidad > 20 && cantidad <= 50){
            descuento = precio * 0.2;
        }
        else if (cantidad > 50){
            descuento = precio * 0.25;
        }
        return descuento;
    }
    public static double calcularRecargo(String medioPago, double precio){
        double recargo = 0.0;
        switch (medioPago){
            case "C", "c" -> recargo = precio * 0.05;
            case "Y", "y" -> recargo = precio * 0.02;
            case "P", "p" -> recargo = precio * 0.025;
            case "D", "d" -> recargo = precio * 0.07;
            case "E", "e" -> recargo =  0;
        }
        return recargo;
    }
}
