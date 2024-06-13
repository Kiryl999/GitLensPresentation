package src;

/**
 * Die Klasse Auto erstellt ein Auto mit verschiedenen Eigenschaften wie marke, etc.
 */
public class Auto {
    private String marke;
    private String modell;
    private int baujahr;
    private int leistung;

     /**
     * Konstruktor zur Initialisierung eines Autos mit den angegebenen Eigenschaften.
     *
     * @param marke die Marke des Autos
     * @param modell das Modell des Autos
     * @param baujahr das Baujahr des Autos
     * @param leistung die Leistung des Autos in PS
     */
    
    public Auto(String marke, String modell, int baujahr, int leistung) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.leistung = leistung;
    }
    
    /**
     * Gibt die Marke des Autos zurück.
     * @return marke Marke des Autos
     */
    public String getMarke() {
        return marke;
    }
    
    /**
     * Gibt das Modell des Autos zurück.
     *
     * @return das Modell des Autos
     */
    public String getModell() {
        return modell;
    }

    /**
     * Gibt das Baujahr des Autos zurück.
     *
     * @return das Baujahr des Autos
     */
    public int getBaujahr() {
        return baujahr;
    }

    /**
     * Gibt die Leistung des Autos in PS zurück.
     *
     * @return die Leistung des Autos
     */

    public int getLeistung(){
        return leistung;
    }
    
    /**
     * Setzt die Marke des Autos.
     *
     * @param marke die neue Marke des Autos
     */
    public void setMarke(String marke) {
        this.marke = marke;
    }
    
    /**
     * Setzt das Modell des Autos.
     *
     * @param modell das neue Modell des Autos
     */
    public void setModell(String modell) {
        this.modell = modell;
    }
    
    /**
     * Setzt das Baujahr des Autos.
     *
     * @param baujahr das neue Baujahr des Autos
     */
    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    /**
     * Setzt die Leistung des Autos in PS.
     *
     * @param leistung die neue Leistung des Autos
     */
    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }
    
    /**
     * Startet das Auto und gibt eine entsprechende Nachricht auf der Konsole aus.
     */
    public void starten() {
        System.out.println("Das Auto startet.");
    }
    
    /**
     * Stoppt das Auto und gibt eine entsprechende Nachricht auf der Konsole aus.
     */
    public void stoppen() {
        System.out.println("Das Auto stoppt.");
    }
}