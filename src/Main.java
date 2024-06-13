package src;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the auto class
        Auto auto = new Auto("Benzer", "C-Klasse", 2020);

        // Access and modify the auto's properties
        auto.setBaujahr(2012);
        auto.setMarke("Mercedes-Benz");
        auto.setModell("S-Klasse");

        // Display the auto's information
        System.out.println("Auto Information:");
        System.out.println("Modell: " + auto.getMarke());
        System.out.println("Modell: " + auto.getModell());
        System.out.println("Baujahr: " + auto.getBaujahr());
   
    }
}
