package src;
/**
 * Basis-Klasse für die anderen Fahrzeuge.
 */
public abstract class Fahrzeug 
{
    private String marke;
    private String modell;
    private int baujahr;
    private int leistung;

    /**
     * Konstruktor initialisiert ein Fahrzeug.
     * 
     * @param marke Marke des Fahrzeugs
     * @param modell Modell des Fahrzeugs
     * @param baujahr Baujahr des Fahrzeugs
     * @param leistung Leistung des Fahrzeugs
     */
    public Fahrzeug(String marke, String modell, int baujahr, int leistung){
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.leistung = leistung;
    }

    /**
     * Gibt die Marke des Fahrzeugs zurück.
     * @return marke Marke des Fahrzeugs
     */
    public String getMarke() {
        return marke;
    }
    
    /**
     * Gibt das Modell des Fahrzeugs zurück.
     *
     * @return das Modell des Fahrzeugs
     */
    public String getModell() {
        return modell;
    }

    /**
     * Gibt das Baujahr des Fahrzeugs zurück.
     *
     * @return das Baujahr des Fahrzeugs
     */
    public int getBaujahr() {
        return baujahr;
    }

    /**
     * Gibt die Leistung des Fahrzeugs in PS zurück.
     *
     * @return die Leistung des Fahrzeugs
     */

    public int getLeistung(){
        return leistung;
    }
    
    /**
     * Setzt die Marke des Fahrzeugs.
     *
     * @param marke die neue Marke des Fahrzeugs
     */
    public void setMarke(String marke) {
        this.marke = marke;
    }
    
    /**
     * Setzt das Modell des Fahrzeugs.
     *
     * @param modell das neue Modell des Fahrzeugs
     */
    public void setModell(String modell) {
        this.modell = modell;
    }
    
    /**
     * Setzt das Baujahr des Fahrzeugs.
     *
     * @param baujahr das neue Baujahr des Fahrzeugs
     */
    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    /**
     * Setzt die Leistung des Fahrzeugs in PS.
     *
     * @param leistung die neue Leistung des Fahrzeugs
     */
    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    /**
     * Abstrakte Methode, soll ein Fahrzeug starten.
     */
    public abstract void starten();

    /**
     * Abstrakte Methode, soll ein Fahrzeug stoppen.
     */
    public abstract void stoppen();
}
