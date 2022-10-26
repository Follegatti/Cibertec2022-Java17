package edu.cibertec.poo.basico.model;

public class Estudiante {
    //propiedades del estudiante
    public String nombre;
    public String carrera;
    public double notaExamenParcial;
    public double notaExamenFinal;

    //Comportamiento
    public double calcularPromedio(){
        return (notaExamenParcial +  notaExamenFinal) / 2;
    }
}
