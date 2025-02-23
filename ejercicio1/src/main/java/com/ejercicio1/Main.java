// Taller de Programación en Java: Uso de Set
// 🚀 Ejercicio 1: Registro de Estudiantes con HashSet
package com.ejercicio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            Set<String> estudiantes = new HashSet<>();

            // 1. Pedir al usuario cuántos estudiantes desea registrar.
            System.out.print("Ingrese la cantidad de estudiantes a registrar: ");
            int cantidad = scanner.nextInt();
                scanner.nextLine();

            // 2. Solicitar el nombre de los estudiantes y almacenarlos en un HashSet<String> .
            for (int i = 0; i < cantidad; i++){
                System.out.print("Ingrese el nombre del estudiante " + (i+1) + ": ");
                estudiantes.add(scanner.nextLine());
            }
            // 3.  Mostrar la lista de estudiantes.
            System.out.println("\nLista de estudiantes registrados: " + estudiantes);
            
            // 4. . Verificar si un estudiante específico está en la lista.
            System.out.print("Ingrese el nombre del estudiante a verificar: ");
            String buscar = scanner.nextLine();
            if (estudiantes.contains(buscar)){
                System.out.println("El estudiante " + buscar + " está en la lista.");
            } else {
                System.out.println("El estudiante " + buscar + " no está en la lista.");
            }
        }
    }
}