package edu.cibertec.poo.basico.model;

public class Estudiante {
    //propiedades del estudiante
    public String nombre;
    public String carrera;
    public double notaExamenParcial;
    public double notaExamenFinal;

    public Estudiante() {
    }

    public Estudiante(String nombre, String carrera, double notaExamenParcial, double notaExamenFinal) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.notaExamenParcial = notaExamenParcial;
        this.notaExamenFinal = notaExamenFinal;
    }

    //Comportamiento
    public double calcularPromedio(){
        return (notaExamenParcial +  notaExamenFinal) / 2;
    }
}
