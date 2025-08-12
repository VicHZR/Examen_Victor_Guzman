package fullstack.herencia.ejercicio2;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private String customerID;
    private ArrayList<Movie> rentedMovies;

    public Customer(String customerName, String customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.rentedMovies = new ArrayList<>();
    }

    public String getCustomerName() {
    	return customerName; 
    	}
    public String getCustomerID() {
    	return customerID; 
    	}
    public ArrayList<Movie> getRentedMovies() {
    	return rentedMovies; 
    	}

    public void rentMovie(Movie movie) {
        rentedMovies.add(movie);
        movie.setAvailable(false);
    }

    public void returnMovie(Movie movie) {
        rentedMovies.remove(movie);
        movie.setAvailable(true);
    }

    public void showCustomerDetails() {
        System.out.println("Cliente: " + customerName + " (ID: " + customerID + ")");
        System.out.println("Películas rentadas:");
        for (Movie movie : rentedMovies) {
            movie.showDetails();
            System.out.println("---");
        }
    }
}
