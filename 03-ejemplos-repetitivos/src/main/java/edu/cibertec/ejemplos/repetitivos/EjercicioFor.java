package edu.cibertec.ejemplos.repetitivos;

import java.util.Random;

public class EjercicioFor {
    /**
     *Crear un arreglo de notas(numeros enteros) con 20 casillas
     * todos estos numeros que se guarden en el arreglo se generaran aleatoriamente
     */
    public static void main(String[] args) {
        int[] notas = new int[20];
        //si quiero saber la capacidad de mi arreglo, puedo hacer lo siguiente...
        int capacidad = notas.length;
        System.out.println("la capacidad de mi arreglo es: " + capacidad);
        //Generar de forma aleatoria elementos para mi arreglo de notas
        //Cuando queremos generar numeros aleatorio, debemos conocer el rango
        int minimo = 0, maximo = 20;
        //Para trabajar con arreglos, utilizamos el for usualmente...
        for (int i = 0; i < capacidad; i++){
            notas[i] = generarNumero(minimo, maximo);
        }
        //Saber como referimos a un elemento de un arreglo
        int primerElemento = notas[0];
        System.out.println("Perimer elemento del arreglo: " + primerElemento);
        //Voy a imprimir todos los elemetos que se guardaron
        System.out.println("===Elementos del Arreglo===");
        for (int nota : notas){
            System.out.println("elemento: " + nota);
        }

    }
    public static int generarNumero(int min, int max){
        //Utilzamos un componente que  permita generar numeros aleatorios
        Random aleatorio = new Random();
        return aleatorio.nextInt(max - min) + min;
    }
}
