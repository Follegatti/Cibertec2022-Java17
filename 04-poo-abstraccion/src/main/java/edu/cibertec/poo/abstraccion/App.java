package edu.cibertec.poo.abstraccion;

import edu.cibertec.poo.abstraccion.model.Circunferencia;

public class App {
    public static void main(String[] args) {
        Circunferencia circunferencia = new Circunferencia("circunferencia","verde",15);
        System.out.println(" figura:" + circunferencia.getNombre() + "tiene un area de1");
    }
}
