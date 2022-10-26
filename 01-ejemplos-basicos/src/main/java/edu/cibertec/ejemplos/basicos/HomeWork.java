package edu.cibertec.ejemplos.basicos;


import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

     /*Creacion de una boleta de Venta
      */
        //el precio de la gasolina por galon es de 17.84
        //cada galon equivale a 3.7854 Litros

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del Vendedor: ");
        String nombreVendedor = scanner.next();
        System.out.println("Apellidos del Vendedor: ");
        String apellidoVendedor = scanner.next();
        System.out.println("DNI");
        String dniVendedor = scanner.next();
        System.out.println("===============================================");
        System.out.println("Ingrese el nombre del Cliente: ");
        String nombreCliente = scanner.next();
        System.out.println("Ingrese el Apellido del Cliente: ");
        String apellidoCliente = scanner.next();
        System.out.println("Ingrese el DNI del Cliente");
        String dniCliente = scanner.next();
        System.out.println("Ingrese la cantidad de galones comprados: ");
        int galones = scanner.nextInt();
        scanner.close();
        double precio = galones * 17.84;
        double cantidadLitros = galones * 3.7854;
        String codigoVendedor = (apellidoVendedor.charAt(0) + dniVendedor.substring(2,5) + nombreVendedor).toUpperCase();
        String rucNatural = "10" + dniCliente + "5";
        double igv = precio*0.18;
        double precioTotal = precio - igv;
        String textoConFormato = """
                ============================FACTURA DE VENTA==========================
                =====================================================================
                =Vendedor: %s                     Codigo de Vendedor:%s             
                =====================================================================
                =Cliente: %s %s                 DNI: %s  
                = RUC: %s                           
                =-----DETALLE---------------------------------------------------------  
                =                                     GAL     Lts          Precio   
                = GASOHOL 97 PLUS                     %d     %.3f    %.2f     
                =                                                                   
                =                                                  IGV   - %.2f     
                =--------------------------------------------------------------------                                       
                =                                     TOTAL:       %.2f             
                --------------------------------------------------------------------
                                GRACIAS POR SU COMPRA !
                """.formatted(nombreVendedor,codigoVendedor,nombreCliente,apellidoCliente,dniCliente,rucNatural,galones,cantidadLitros
        ,precio,igv,precioTotal);
        System.out.println(textoConFormato);

    }
}
