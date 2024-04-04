import java.util.ArrayList;

public class PCSetup {
    // Define an array of PC Components and additional features
    private ArrayList<PCComponent> components = new ArrayList<>();
    private boolean hasCaseSizePremium;
    private boolean hasRGBLighting;
    private boolean hasLiquidCooling;

    // Constructor
    public PCSetup() {
    }

    // Setter for the case size premium field
    public void setHasCaseSizePremium(boolean hasCaseSizePremium) {
        this.hasCaseSizePremium = hasCaseSizePremium;
    }

    // Getter for the case size premium field
    public boolean getHasCaseSizePremium() {
        return hasCaseSizePremium;
    }

    // Setter for the RGB Lighting field
    public void setHasRGBLighting(boolean hasRGBLighting) {
        this.hasRGBLighting = hasRGBLighting;
    }

    // Getter for the RGB Lighting field
    public boolean getHasRGBLighting() {
        return hasRGBLighting;
    }

    // Setter for the liquid cooling field
    public void setHasLiquidCooling(boolean hasLiquidCooling) {
        this.hasLiquidCooling = hasLiquidCooling;
    }

    // Getter for the liquid cooling
    public boolean getHasLiquidCooling() {
        return hasLiquidCooling;
    }

    // Add components to the array of components
    public void addComponent(PCComponent component) {
        components.add(component);
    }

    // Calculate the total price
    public double calculateTotalPrice() {
        double totalPrice = 0;

        // Look through the array of components and add corresponding prices to the variable of totalPrice
        for (PCComponent component : components) {
            totalPrice += component.getPrice();
    }

    // The price is added to totalPrice, if the condition is true
    if (hasCaseSizePremium) {
        totalPrice += 30;
    }
    if (hasRGBLighting) {
        totalPrice += 40;
    }
    if (hasLiquidCooling) {
        totalPrice += 50;
}
    return totalPrice;
}
}
