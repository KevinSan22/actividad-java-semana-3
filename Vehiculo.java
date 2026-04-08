

import java.util.Scanner; // Importa la clase Scanner para leer datos desde el teclado

public class Vehiculo { // Declara la clase principal llamada Vehiculo

    public static void main(String[] args) { // Método principal donde inicia el programa

        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para capturar datos del usuario

        String marca; // Variable para guardar la marca
        String modelo; // Variable para guardar el modelo
        int cilindrada; // Variable para guardar la cilindrada
        String combustible; // Variable para guardar el tipo de combustible
        int pasajeros; // Variable para guardar la cantidad de pasajeros

        System.out.println("Ingrese la marca:"); // Solicita la marca al usuario
        marca = scanner.nextLine(); // Guarda la marca ingresada

        System.out.println("Ingrese el modelo:"); // Solicita el modelo al usuario
        modelo = scanner.nextLine(); // Guarda el modelo ingresado

        System.out.println("Ingrese la cilindrada:"); // Solicita la cilindrada
        cilindrada = scanner.nextInt(); // Guarda la cilindrada ingresada
        scanner.nextLine(); // Limpia el buffer del teclado

        System.out.println("Ingrese el tipo de combustible:"); // Solicita el combustible
        combustible = scanner.nextLine(); // Guarda el combustible ingresado

        System.out.println("Ingrese la cantidad de pasajeros:"); // Solicita la cantidad de pasajeros
        pasajeros = scanner.nextInt(); // Guarda la cantidad ingresada

        System.out.println("La marca que ha ingresado es: " + marca); // Muestra la marca
        System.out.println("El modelo que ha ingresado es: " + modelo); // Muestra el modelo
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada); // Muestra la cilindrada
        System.out.println("El tipo de combustible es: " + combustible); // Muestra el combustible
        System.out.println("Tiene una capacidad de " + pasajeros + " pasajeros."); // Muestra la capacidad

        scanner.close(); // Cierra el objeto Scanner
    } // Fin del método main
} // Fin de la clase Vehiculo
