package edu.cibertec.poo.herencia.model;

public class EmpleadoCotratista extends Empleado {
    private double horas;
    private double tarifa;

    public EmpleadoCotratista(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, int edad,
                              double horas, double tarifa) {
        super(dni, nombre, apellidoPaterno, apellidoMaterno, edad);
        this.horas = horas;
        this.tarifa = tarifa;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public double calcularSueldoNeto() {
        //calculo de sueldo neto
        return horas * tarifa;
    }
}
