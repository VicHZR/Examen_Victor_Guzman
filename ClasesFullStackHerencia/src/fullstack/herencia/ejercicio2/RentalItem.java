package fullstack.herencia.ejercicio2;

public class RentalItem {
    private String itemName;
    private String itemID;
    private boolean available;

    public RentalItem(String itemName, String itemID) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.available = true;
    }

    public String getItemName() { return itemName; }
    public String getItemID() { return itemID; }
    public boolean isAvailable() { return available; }

    public void setItemName(String itemName) { this.itemName = itemName; }
    public void setItemID(String itemID) { this.itemID = itemID; }
    public void setAvailable(boolean available) { this.available = available; }

    public void showDetails() {
        System.out.println("Nombre: " + itemName);
        System.out.println("ID: " + itemID);
        System.out.println("Disponible: " + (available ? "Sí" : "No"));
    }
}
