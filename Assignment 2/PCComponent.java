// Define a PCComponent class
public class PCComponent {
    private String model;
    private double price;

    // Constructor
    public PCComponent(String model, double price) {
    this.model = model;
    this.price = price;
    } 
    
    // Setter for the model field
    public void setModel (String model) {
        this.model = model;
    }

    // Getter for the model
    public String getModel() {
        return this.model;
    }

    // Setter for the price field
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for the price
    public double getPrice() {
        return this.price;
    }
}