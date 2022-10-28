package edu.cibertec.poo.ejerccio;

import edu.cibertec.poo.ejerccio.model.Producto;

public class App {
    public static void main(String[] args) {
        Producto producto = new Producto("1","palta",6.50,40);
        System.out.println("el producto es: " + producto.getNombre());
        System.out.println("Tiene stock? : " + producto.tieneStock());
        System.out.println("Precio unitario con IGV: " + producto.calcularPrecioConIgv());
    }
}
