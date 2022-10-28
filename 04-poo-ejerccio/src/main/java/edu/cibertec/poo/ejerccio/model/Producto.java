package edu.cibertec.poo.ejerccio.model;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    public Producto() {
    }

    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    //comportamiento adicional
    //saber si un producto tiene stock o no
    public boolean tieneStock(){
      /*  if(stock > 0){
            return true;
        }else {
            return false;
        }*/
        return stock > 0;
    }
    //Obtener el recargo del IGV (19%)
    public double calcularPrecioConIgv(){
        return precio * 1.19;
    }
}
