package src;

 
/**
 * Die Main Klasse erstellt Instanzen von Fahrzeugen und zeigt ihre Informationen an.
 */
public class Main {
 
    /**
     * Die Main Methode erstellt Instanzen von Fahrzeugen und zeigt ihre Informationen an.
     * @param args Befehlszeilenargumente
     */
    public static void main(String[] args) {
        // Create an instance of the auto class
        Auto auto = new Auto("Benzer", "C-Klasse", 2020, 194);

        // Access and modify the auto's properties
        auto.setBaujahr(2012);
        auto.setMarke("Mercedes-Benz");
        auto.setModell("S-Klasse");

        auto.starten();

        // Display the auto's information
        System.out.println("Auto Information:");
        System.out.println("Marke: " + auto.getMarke());
        System.out.println("Modell: " + auto.getModell());
        System.out.println("Baujahr: " + auto.getBaujahr());
        System.out.println("Leistung: " + auto.getLeistung());

        // Create an instance of the LKW class
        LKW lkw = new LKW("Mercedes-Benz", "Actros", 2018, 500, 8, 40.0);

        // DIsplay the LKW's information
        System.out.println("\nLKW Information: ");
        System.out.println("Marke: " + lkw.getMarke());
        System.out.println("Modell: " + lkw.getModell());
        System.out.println("Baujahr: " + lkw.getBaujahr());
        System.out.println("Leistung: " + lkw.getLeistung());
        System.out.println("Reifen: " + lkw.getReifen());
        System.out.println("Zuladung: " + lkw.getZuladung());


   
    }
}
