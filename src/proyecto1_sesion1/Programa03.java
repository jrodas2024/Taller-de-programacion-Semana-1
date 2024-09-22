package proyecto1_sesion1;

/**
 *
 * @author Server
 */
import java.util.Scanner;

public class Programa03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables
        double totalSueldos,promedioSueldos,sueldo1, sueldo2, sueldo3, sueldo4, sueldo5;
 
        // Entrada de datos
        System.out.print("Sueldo 1: ");
        sueldo1 = scanner.nextDouble();
        
        System.out.print("Sueldo 2: ");
        sueldo2 = scanner.nextDouble();
        
        System.out.print("Sueldo 3: ");
        sueldo3 = scanner.nextDouble();
        
        System.out.print("Sueldo 4: ");
        sueldo4 = scanner.nextDouble();
        
        System.out.print("Sueldo 5: ");
        sueldo5 = scanner.nextDouble();

        // Cálculos
        totalSueldos = sueldo1 + sueldo2 + sueldo3 + sueldo4 + sueldo5;
        promedioSueldos = totalSueldos / 5;

        // Resultados
        System.out.println("Total de sueldos: " + totalSueldos);
        System.out.println("Promedio de sueldos: " + promedioSueldos);
    }
}