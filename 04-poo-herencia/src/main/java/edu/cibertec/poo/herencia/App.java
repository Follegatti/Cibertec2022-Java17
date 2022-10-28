package edu.cibertec.poo.herencia;


import edu.cibertec.poo.herencia.model.EmpleadoCotratista;
import edu.cibertec.poo.herencia.model.EmpleadoPlanilla;

public class App {
    public static void main(String[] args) {
        EmpleadoPlanilla empleadoPlanilla = new EmpleadoPlanilla("12345678","Enrique","Follegatti",
                "Velarde",28,2800);
        empleadoPlanilla.imprimirDatos();

        EmpleadoCotratista empleadoCotratista = new EmpleadoCotratista("87654321","Ricardo","Oriundo","Velarde", 37,20,8);
        empleadoCotratista.imprimirDatos();

    }
}
