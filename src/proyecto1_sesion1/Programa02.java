package proyecto1_sesion1;

/**
 *
 * @author Server
 */
import java.util.Scanner;

public class Programa02 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // Variables
        String nombreCliente,producto;   
        double precio,subtotal,igv,totalPagar;     
        int cantidad;            

        // Entrada de datos
        System.out.print("Nombre del cliente: ");
        nombreCliente = lectura.nextLine();
        
        System.out.print("Producto: ");
        producto = lectura.nextLine();
        
        System.out.print("Precio: ");
        precio = lectura.nextDouble();
        
        System.out.print("Cantidad: ");
        cantidad = lectura.nextInt();

        // Cálculos
        subtotal = precio * cantidad;
        igv = subtotal * 0.18; // 18% de IGV
        totalPagar = subtotal + igv;

        // Resultados
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IGV: " + igv);
        System.out.println("Total a pagar: " + totalPagar);
    }
}