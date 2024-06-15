package src;

/**
 * Die Klasse Auto erstellt ein Auto mit verschiedenen Eigenschaften wie marke, etc.
 */
public class Auto extends Fahrzeug{

     /**
     * Konstruktor zur Initialisierung eines Autos mit den angegebenen Eigenschaften.
     *
     * @param marke die Marke des Autos
     * @param modell das Modell des Autos
     * @param baujahr das Baujahr des Autos
     * @param leistung die Leistung des Autos in PS
     */
    
    public Auto(String marke, String modell, int baujahr, int leistung) {
        super(marke,modell,baujahr,leistung);
    }
    
    
    /**
     * Startet das Auto und gibt eine entsprechende Nachricht auf der Konsole aus.
     */
    @Override
    public void starten() {
        System.out.println("Das Auto startet.");
    }
    
    /**
     * Stoppt das Auto und gibt eine entsprechende Nachricht auf der Konsole aus.
     */
    @Override
    public void stoppen() {
        System.out.println("Das Auto stoppt.");
    }
}