package src;
/**
 * Die Klasse Motorrad erstellt ein Motorrad mit verschiedenen Eigenschaften wie marke, etc.
 */
public class Motorrad extends Fahrzeug{
    private String farbe;

    /**
     * Konstruktor zur Initialisierung eines Motorrads mit den angegebenen Eigenschaften.
     *
     * @param marke die Marke des Motorrads
     * @param modell das Modell des Motorrads
     * @param baujahr das Baujahr des Motorrads
     * @param leistung die Leistung des Motorrads in PS
     * @param farbe die Farbe des Motorrads
     */
    public Motorrad(String marke, String modell, int leistung, int baujahr, String farbe){
        super(marke, modell, baujahr, leistung);
        this.farbe = farbe;
    }

    

    /**
     * Gibt die Farbe des Motorrads zurück
     * 
     * @param farbe die Farbe des Motorrads
     */

     public String getFarbe(){
        return farbe;
     }
    

    /**
     * Setzt die Farbe des Motorrads.
     * 
     * @param farbe die Farbe des Motorrads
     */
    public void setFarbe(String farbe){
        this.farbe = farbe;
    }

    /**
     * Startet das Motorrad und gibt eine entsprechende Nachricht auf der Konsole aus.
     */
    @Override
    public void starten() {
        System.out.println("Das Motorrad startet");
    }


    /**
     * Stoppt das Motorrad und gibt eine entsprechende Nachricht auf der Konsole aus.
     */
    @Override
    public void stoppen() {
        System.out.println("Das Motorrad bremst!");
    }

}
