
package edu.cibertec.ejemplos.basicos;

/**
 *
 * @author Follegatti Velarde Enrique
 */
public class Principal {


    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 10;
        int result = firstNumber + secondNumber;
        System.out.println("el resultado de la suma es: " + result);


        double baseSalary = 1100;
        double discount = 0.15 * baseSalary;
        double totalSalary = baseSalary - discount;
        System.out.println("====================================");
        System.out.println("sueldo base: " + baseSalary);
        System.out.println("descuento: " + discount);
        System.out.println("sueldo total: " + totalSalary);

        char female ;
        char male;

        boolean good = true;
        System.out.println("" + good);
    }
    
}
