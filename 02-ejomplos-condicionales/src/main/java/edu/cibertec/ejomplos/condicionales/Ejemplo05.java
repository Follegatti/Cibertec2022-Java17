package edu.cibertec.ejomplos.condicionales;

public class Ejemplo05 {
    public static void main(String[] args) {
        /**
         * Vamos a mirar la diferenci de comportamiento
         * comportamiento entre el
         * if multiple y el if-else-if
         */

        int numero = 100;
        //el if multiple indica que cada condicion es independiente
        if (numero > 0){
            System.out.println("El numero es positivo");
        }
        if (numero > 50){
            System.out.println("El numero es mayo que 50");
        }
        if (numero > 99){
            System.out.println("el numero tiene mas de 2 cifras");
        }
        //vamos a usar  el if-else-if
        int otroNumero = 18;
        if (otroNumero > 0){
            System.out.println("el otro numero es positivo");
        }
        else if (otroNumero > 9){
            System.out.println("el otro numero es mayor que 9");
        }
        else if (otroNumero % 2 == 0){
            System.out.println("Elnumero es par");
        }
    }
}
