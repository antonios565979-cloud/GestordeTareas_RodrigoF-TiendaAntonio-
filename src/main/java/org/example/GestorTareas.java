package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorTareas {
    private List<tarea> listaTareas = new ArrayList<>();
    private Scanner scanner;

    public GestorTareas(Scanner scanner) {
        this.scanner = scanner;
    }
    // si es el user pone 1 sale este resultado
    public void anadirTarea() {
        System.out.print("Introduce la descripción de la tarea: ");
        String descripcion = scanner.nextLine();
        listaTareas.add(new tarea(descripcion));
        System.out.println("Tarea añadida con éxito.");

        Scanner opcion = new Scanner(System.in);
        System.out.println("Dime la prioridad de la tarea: 1. Alta, 2. Media, 3. Baja");


        int seleccion = opcion.nextInt();
        Prioridad seleccionPrioridad = null;

        switch (seleccion){
            case 1 :
                seleccionPrioridad = Prioridad.ALTA;
                break;
                case 2 :
                    seleccionPrioridad = Prioridad.MEDIA;
                    break;

            case 3:
                seleccionPrioridad = Prioridad.BAJA;
                break;

            default:
                System.out.println("Eleccion incorrecta");


        }

    }

    // case 2 muestra las tareas guardadas y las enumera
    public void listarTareas() {
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }
        System.out.println("\n--- LISTA DE TAREAS ---");
        for (int i = 0; i < listaTareas.size(); i++) {
            System.out.println((i + 1) + ". " + listaTareas.get(i));
        }
    }

    // case 3
    public void marcarCompletada() {
        listarTareas(); // muestra las tareas enumeradas para saber cual marcar como completada
        if (listaTareas.isEmpty()) return;

        System.out.print("Introduce el número de la tarea a marcar como completada: ");
        if (scanner.hasNextInt()) {
            int indice = scanner.nextInt() - 1; // -1 porque el usuario ve la lista empezando en 1
            scanner.nextLine();
            if (indice >= 0 && indice < listaTareas.size()) {
                listaTareas.get(indice).marcarComoHecha();
                System.out.println("Tarea marcada como completada.");
            } else {
                System.out.println("Número de tarea no válido.");
            }
        } else {
            System.out.println("Por favor, introduce un número válido.");
            scanner.nextLine();
        }
    }

    // case 4 para eliminar una tarea
    public void eliminarTarea() {
        listarTareas();
        if (listaTareas.isEmpty()) return;

        System.out.print("Introduce el número de la tarea a eliminar: ");
        if (scanner.hasNextInt()) {
            int indice = scanner.nextInt() - 1;
            scanner.nextLine();
            if (indice >= 0 && indice < listaTareas.size()) {
                listaTareas.remove(indice);
                System.out.println("Tarea eliminada con éxito.");
            } else {
                System.out.println("Número de tarea no válido.");
            }
        } else {
            System.out.println("Por favor, introduce un número válido.");
            scanner.nextLine();
        }
    }

    public void filtrarTarea()
    {
        Scanner filtro = new Scanner(System.in);
        System.out.println("Porque prioridad quieres filtrar? ");
        filtro.nextLine();

        switch (filtro)
        {
            case :

        }
    }

}
