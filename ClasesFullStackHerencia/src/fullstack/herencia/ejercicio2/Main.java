package fullstack.herencia.ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovieRentalSystem system = new MovieRentalSystem();
        Scanner scanner = new Scanner(System.in);

        // Películas de ejemplo
        system.addItem(new Movie("Interstellar", "M001", "Christopher Nolan", 169, "PG-13", "Sci-Fi"));
        system.addItem(new Movie("Titanic", "M002", "James Cameron", 195, "PG-13", "Romance"));
        system.addItem(new Movie("The Godfather", "M003", "Francis Ford Coppola", 175, "R", "Crime"));

        // Clientes de ejemplo
        system.registerCustomer(new Customer("Carlos", "C001"));
        system.registerCustomer(new Customer("María", "C002"));

        int option;
        do {
            System.out.println("\n--- Menú de Renta de Películas ---");
            System.out.println("1. Mostrar todas las películas");
            System.out.println("2. Mostrar todos los clientes");
            System.out.println("3. Rentar película");
            System.out.println("4. Devolver película");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (option) {
                case 1:
                    system.showAllItems();
                    break;
                case 2:
                    system.showAllCustomers();
                    break;
                case 3:
                    System.out.print("ID de la película: ");
                    String rentID = scanner.nextLine();
                    System.out.print("ID del cliente: ");
                    String rentCustomer = scanner.nextLine();
                    system.rentMovieToCustomer(rentID, rentCustomer);
                    break;
                case 4:
                    System.out.print("ID de la película: ");
                    String returnID = scanner.nextLine();
                    System.out.print("ID del cliente: ");
                    String returnCustomer = scanner.nextLine();
                    system.returnMovie(returnID, returnCustomer);
                    break;
                case 5:
                    System.out.println("¡Gracias por usar el sistema!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (option != 5);

        scanner.close();
    }
}
