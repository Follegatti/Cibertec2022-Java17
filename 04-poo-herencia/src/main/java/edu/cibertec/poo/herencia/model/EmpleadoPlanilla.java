package edu.cibertec.poo.herencia.model;

public class EmpleadoPlanilla extends Empleado{

    private double sueldoBasico;

    public EmpleadoPlanilla(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, int edad, double sueldoBasico) {
        super(dni, nombre, apellidoPaterno, apellidoMaterno, edad);
        this.sueldoBasico = sueldoBasico;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    public void mostarNombre(){

    }

    @Override
    public double calcularSueldoNeto() {
        //calculo de sueldo neto con descuento de AFP generica y renta de quinta
        return sueldoBasico - (sueldoBasico * 0.13) - (sueldoBasico * 0.14);
    }

    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("sueldo basico: " + sueldoBasico);
    }
}
