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
        //Erstellt eine Auto-Instanz
        Auto auto = new Auto("Benzer", "C-Klasse", 2020, 194);

        auto.setBaujahr(2012);
        auto.setMarke("Mercedes-Benz");
        auto.setModell("S-Klasse");

        auto.starten();

        System.out.println("Auto Information:");
        System.out.println("Marke: " + auto.getMarke());
        System.out.println("Modell: " + auto.getModell());
        System.out.println("Baujahr: " + auto.getBaujahr());
        System.out.println("Leistung: " + auto.getLeistung());

        LKW lkw = new LKW("Mercedes-Benz", "Actros", 2018, 500, 8, 40.0);

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
   
    }
}
