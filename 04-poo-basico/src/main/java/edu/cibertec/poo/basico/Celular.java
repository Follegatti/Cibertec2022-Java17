package edu.cibertec.poo.basico;

public class Celular {

    String marca;
    String modelo;
    int anio;
    double precio;

    //constructores
    public Celular() {
    }

    public Celular(String mar, String mod, int ani, double pre) {
        marca = mar;
        modelo = mod;
        anio = ani;
        precio = pre;
    }
    public Celular(String mar, String mod, int ani) {
        marca = mar;
        modelo = mod;
        anio = ani;
    }

    void enviarSms(){
        System.out.println("Enviando mensaje de texto...");
    }

}
