package edu.cibertec.poo.abstraccion.model;

public class Circunferencia extends Figura{
    private double radio;

    public Circunferencia(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.pow(radio,2) * Math.PI;
    }
}
