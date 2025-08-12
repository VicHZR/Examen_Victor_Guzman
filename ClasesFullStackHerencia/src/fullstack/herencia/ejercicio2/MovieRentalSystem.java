package fullstack.herencia.ejercicio2;

import java.util.ArrayList;

public class MovieRentalSystem {
    private ArrayList<RentalItem> rentalItems;
    private ArrayList<Customer> customers;

    public MovieRentalSystem() {
        rentalItems = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void addItem(RentalItem item) {
        rentalItems.add(item);
    }

    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    public void rentMovieToCustomer(String itemID, String customerID) {
        RentalItem item = findItemByID(itemID);
        Customer customer = findCustomerByID(customerID);

        if (item instanceof Movie && item.isAvailable() && customer != null) {
            customer.rentMovie((Movie) item);
            System.out.println("Película rentada exitosamente.");
        } else {
            System.out.println("No se pudo rentar la película.");
        }
    }

    public void returnMovie(String itemID, String customerID) {
        Customer customer = findCustomerByID(customerID);
        if (customer != null) {
            for (Movie movie : customer.getRentedMovies()) {
                if (movie.getItemID().equals(itemID)) {
                    customer.returnMovie(movie);
                    System.out.println("Película devuelta exitosamente.");
                    return;
                }
            }
        }
        System.out.println("No se encontró la película en la lista del cliente.");
    }

    public void showAllItems() {
        for (RentalItem item : rentalItems) {
            item.showDetails();
            System.out.println("-----------");
        }
    }

    public void showAllCustomers() {
        for (Customer customer : customers) {
            customer.showCustomerDetails();
            System.out.println("===========");
        }
    }

    private RentalItem findItemByID(String itemID) {
        for (RentalItem item : rentalItems) {
            if (item.getItemID().equals(itemID)) return item;
        }
        return null;
    }

    private Customer findCustomerByID(String customerID) {
        for (Customer customer : customers) {
            if (customer.getCustomerID().equals(customerID)) return customer;
        }
        return null;
    }
}
