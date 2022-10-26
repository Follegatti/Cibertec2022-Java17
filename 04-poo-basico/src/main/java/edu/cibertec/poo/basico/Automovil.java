package edu.cibertec.poo.basico;

public class Automovil {

    private String marca;
    private String modelo;
    private double precio;

    //compartimiento
    public void imprimir(){
        System.out.println(String.format("Automovil %s - %s cuesta %.2f",marca,modelo,precio));
    }
    //defino los metodos get/set del encapsulamieto

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
