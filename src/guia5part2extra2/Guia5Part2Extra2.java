/*
 Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y tendrá como
atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos de tipo
CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante y su disco con
más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le dé la opción al usuario de agregar un
cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario elija o de salir del
programa. Al final se deberá mostrar la lista con todos los cambios.
 */
package guia5part2extra2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Guia5Part2Extra2 {

    
   public static void main(String[] args) {
        List<CantanteFamoso> cantantes = new ArrayList<>();
        
        // Agregar 5 cantantes iniciales
        cantantes.add(new CantanteFamoso("Cantante 1", "Disco 1"));
        cantantes.add(new CantanteFamoso("Cantante 2", "Disco 2"));
        cantantes.add(new CantanteFamoso("Cantante 3", "Disco 3"));
        cantantes.add(new CantanteFamoso("Cantante 4", "Disco 4"));
        cantantes.add(new CantanteFamoso("Cantante 5", "Disco 5"));
        
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        
        while (opcion != 4) {
            System.out.println("Menú:");
            System.out.println("1. Agregar un cantante");
            System.out.println("2. Mostrar todos los cantantes");
            System.out.println("3. Eliminar un cantante");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cantante: ");
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el disco con más ventas: ");
                    String discoConMasVentas = scanner.nextLine();
                    cantantes.add(new CantanteFamoso(nombre, discoConMasVentas));
                    System.out.println("Cantante agregado correctamente.");
                    break;
                case 2:
                    System.out.println("Lista de cantantes:");
                    for (CantanteFamoso cantante : cantantes) {
                        System.out.println("Nombre: " + cantante.getNombre());
                        System.out.println("Disco con más ventas: " + cantante.getDiscoConMasVentas());
                        System.out.println("---------------------------");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el índice del cantante a eliminar: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < cantantes.size()) {
                        cantantes.remove(indice);
                        System.out.println("Cantante eliminado correctamente.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
        
                System.out.println("Lista final de cantantes:");
        for (CantanteFamoso cantante : cantantes) {
            System.out.println("Nombre: " + cantante.getNombre());
            System.out.println("Disco con más ventas: " + cantante.getDiscoConMasVentas());
            System.out.println("---------------------------");
        }
    }
}