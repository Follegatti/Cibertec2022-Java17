package edu.cibertec.poo.basico;

import edu.cibertec.poo.basico.model.Estudiante;

public class Aplication {
    public static void main(String[] args) {
        //Voy a crear un objeto basado en la clase que he definido
        Celular celular = new Celular();
        //Crear un objeto = crear unaa instancia de la clase
        //asigno valores a sus propiedades
        celular.marca = "Apple";
        celular.anio = 2022;
        celular.modelo = "iPhone 14";
        celular.precio = 4200.40;
        //Puedo tambien utilizaar el comprtamiento
        celular.enviarSms();
        System.out.println("Marca y modelo: " + " "+ celular.marca+" " + celular.modelo);

        //Voy a crear un bojeto nuevo, pero asignandole valores durante sus construccion
        Celular celular2 = new Celular("Sammsung","Galaxy S20",2022,3500);
        System.out.println("Marca y modelo: " + " "+ celular2.marca+" " + celular2.modelo);

        //Voy a crear un tercer celular, pero sin el precio porq ahun no lo conozco
        Celular celular3 = new Celular("Xiaomi","Redmi Note 11 Pro",2021);

        //Aqui vamos a manejar los datos del estudiante
        Estudiante estudiante = new Estudiante();
        estudiante.nombre = "Enrique";
        estudiante.carrera = "Informatica";
        estudiante.notaExamenParcial = 19;
        estudiante.notaExamenFinal = 20;

        System.out.println("El promedio final es: " + estudiante.calcularPromedio());


        //Vamos a interectuar con el modificador de acceso private
        Automovil automovil = new Automovil();
        automovil.setMarca("BMW");
        automovil.setModelo("335i");
        automovil.setPrecio(42000.00);
        automovil.imprimir();
        //
    }
}
