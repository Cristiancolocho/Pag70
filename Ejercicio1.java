/*1. Desarrollar un programa que permita almacenar cualquier valor numérico hasta que el usuario decida de-
tener el programa, se debe calcular el promedio de los números introducidos y la cantidad de números
 */

 import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        int cantidad = 0;
        String opcion;

        do {
            System.out.print("Introduce un número: ");
            double numero = scanner.nextDouble();
            suma += numero;
            cantidad++;

            System.out.print("¿Deseas ingresar otro número? (s/n): ");
            opcion = scanner.next();
        } while (opcion.equalsIgnoreCase("s"));

        if (cantidad > 0) {
            double promedio = suma / cantidad;
            System.out.println("Cantidad de números introducidos: " + cantidad);
            System.out.println("Promedio: " + promedio);
        } else {
            System.out.println("No se introdujeron números.");
        }
        scanner.close();
    }
}