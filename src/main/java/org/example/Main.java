package org.example;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GestorTareas gestor = new GestorTareas(scanner);

    public static void main(String[] args) {
        int opcion = 0; // opcion elegida por el user

        // menú de opciones que te sale al iniciar
        do {
            System.out.println("\n=== GESTOR DE TAREAS ===");
            System.out.println("1. Añadir tarea");
            System.out.println("2. Ver lista de tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Filtrar por prioridad");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                // según la opción elegida, se llama al metodo que va a trabajar
                switch (opcion) {
                    case 1 -> gestor.anadirTarea();
                    case 2 -> gestor.listarTareas();
                    case 3 -> gestor.marcarCompletada();
                    case 4 -> gestor.eliminarTarea();
                    case 5 -> gestor.filtrarTarea();
                    case 6 -> System.out.println("¡Hasta luego!");
                    default -> System.out.println("Opción no válida. Inténtalo de nuevo (1-5).");
                }
            } else {
                // el user mete algo q no es un numero entonces sale esto
                System.out.println("Por favor introduce un número(1-6).");
                scanner.nextLine();
            }
            // si el user mete un num que no esté comprendido el bucle se repite
        } while (opcion != 6);
    }
}