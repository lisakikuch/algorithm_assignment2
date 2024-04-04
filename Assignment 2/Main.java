public class Main {
    public static void main(String[] args) {
        // Make a first instance
        PCSetup PCSetup1 = new PCSetup();
        CPU setCPU1 = new CPU("corei7", 500);
        GPU setGPU1 = new GPU("RTX4070", 400);
        RAM setRAM1 = new RAM("16GB", 300);
        Storage setStorage1 = new Storage("SSD", 200);

        // Set values for the first instance
        PCSetup1.addComponent(setCPU1);
        PCSetup1.addComponent(setGPU1);
        PCSetup1.addComponent(setRAM1);
        PCSetup1.addComponent(setStorage1);
        PCSetup1.setHasCaseSizePremium(false);
        PCSetup1.setHasRGBLighting(true);
        PCSetup1.setHasLiquidCooling(false);

        // Call the function and display the result
        double totalPrice1 = PCSetup1.calculateTotalPrice();
        System.out.println("Your PC setup is $" + totalPrice1 + " in total.");

        // Make a second instance
        PCSetup PCSetup2 = new PCSetup();
        CPU setCPU2 = new CPU("Ryzen7", 450);
        GPU setGPU2 = new GPU("ASUS", 350.5);
        RAM setRAM2 = new RAM("32GB", 255);
        Storage setStorage2 = new Storage("HDD", 100);

        // Set values for the second instance
        PCSetup2.addComponent(setCPU2);
        PCSetup2.addComponent(setGPU2);
        PCSetup2.addComponent(setRAM2);
        PCSetup2.addComponent(setStorage2);
        PCSetup2.setHasCaseSizePremium(true);
        PCSetup2.setHasRGBLighting(false);
        PCSetup2.setHasLiquidCooling(true);

        // Call the function and display the result
        double totalPrice2 = PCSetup2.calculateTotalPrice();
        System.out.println("Your PC setup is $" + totalPrice2 + " in total.");

    }
}