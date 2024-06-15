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



        Motorrad motorrad = new Motorrad("Kawasaki", "Ninja", 180, 2020, "Grün");

        System.out.println("\nMotorrad Information:");
        System.out.println("Marke: " + motorrad.getMarke());
        System.out.println("Modell: " + motorrad.getModell());
        System.out.println("Baujahr: " + motorrad.getBaujahr());
        System.out.println("Leistung: " + motorrad.getLeistung());
        System.out.println("Farbe: " + motorrad.getFarbe());


        // Erstelle eine Instanz der B2-Klasse
        B2 b2 = new B2("B2", 52.43, 11000, 1030, Flugzeug.Antrieb.JET, 31);

        System.out.println("\nB2 Information:");
        System.out.println("Modell: " + b2.getModell());
        System.out.println("Spannweite: " + b2.getSpannweite());
        System.out.println("Reichweite: " + b2.getReichweite());
        System.out.println("Reisegeschwindigkeit: " + b2.getReiseGeschwindigkeit());
        System.out.println("Antrieb: " + b2.getAntrieb());
        System.out.println("Anzahl der Bomben: " + b2.getAnzahlBomben());
   
    }
}
