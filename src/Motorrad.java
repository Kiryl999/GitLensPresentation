package src;
/**
 * Die Klasse Motorrad erstellt ein Motorrad mit verschiedenen Eigenschaften wie marke, etc.
 */
public class Motorrad implements Fahrzeug{
    private String marke;
    private String modell;
    private int leistung;
    private int baujahr;
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
        this.marke = marke;
        this.modell = modell;
        this.leistung = leistung;
        this.baujahr = baujahr;
        this.farbe = farbe;
    }

    /**
     * Gibt die Marke des Motorrads zurück.
     * @return marke Marke des Motorrads
     */
    public String getMarke() {
        return marke;
    }
    
    /**
     * Gibt das Modell des Motorrads zurück.
     *
     * @return das Modell des Motorrads
     */
    public String getModell() {
        return modell;
    }

    /**
     * Gibt das Baujahr des Motorrads zurück.
     *
     * @return das Baujahr des Motorrads
     */
    public int getBaujahr() {
        return baujahr;
    }

    /**
     * Gibt die Leistung des Motorrads in PS zurück.
     *
     * @return die Leistung des Motorrads
     */

    public int getLeistung(){
        return leistung;
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
     * Setzt die Marke des Motorrads.
     *
     * @param marke die neue Marke des Motorrads
     */
    public void setMarke(String marke) {
        this.marke = marke;
    }
    
    /**
     * Setzt das Modell des Motorrads.
     *
     * @param modell das neue Modell des Motorrads
     */
    public void setModell(String modell) {
        this.modell = modell;
    }
    
    /**
     * Setzt das Baujahr des Motorrads.
     *
     * @param baujahr das neue Baujahr des Motorrads
     */
    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    /**
     * Setzt die Leistung des Motorrads in PS.
     *
     * @param leistung die neue Leistung des Motorrads
     */
    public void setLeistung(int leistung) {
        this.leistung = leistung;
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
