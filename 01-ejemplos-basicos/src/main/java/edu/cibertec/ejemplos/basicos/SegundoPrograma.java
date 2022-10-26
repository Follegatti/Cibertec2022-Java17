package edu.cibertec.ejemplos.basicos;

public class SegundoPrograma {

    public static void main(String[] args) {
        double firstNumber = 5;
        double secondNumber = 10;

        double resultSuma = suma(firstNumber,secondNumber);
        double resultDifference = resta(firstNumber,secondNumber);
        imprimir("el valor de la suma: " + resultSuma);
        imprimir("el valor de la resta: " + resultDifference);
        imprimir("el valor de la multiplicacion: " +
                multiplicar(firstNumber,secondNumber));

        saludar();
    }
    public static double suma(double a,double b){
       double result= a + b;
        return result;
    }
    public static double resta(double a,double b){
        return  a - b;
    }
    public static double multiplicar(double a,double b){
        return  a * b;
    }
    public static void imprimir(String message){
        System.out.println(message);
    }
    public static  void saludar(){
        System.out.println("hola a todos");
    }

}
