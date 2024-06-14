package src;

/**
 * Die Klasse LKW erstellt ein LKW mit verschiedenen Eigenschaften wie marke, etc.
 */
public class LKW implements Fahrzeug{
    private String marke;
    private String modell;
    private int baujahr;
    private int leistung;
    private int reifen;
    private double zuladung;

     /**
     * Konstruktor zur Initialisierung eines LKWs mit den angegebenen Eigenschaften.
     *
     * @param marke die Marke des LKWs
     * @param modell das Modell des LKWs
     * @param baujahr das Baujahr des LKWs
     * @param leistung die Leistung des LKWs in PS
     * @param reifen die Anzahl der Reifen des LKWs
     * @param zuladung die Zuladung des LKWs in Tonnen
     */
    
    public LKW(String marke, String modell, int baujahr, int leistung, int reifen, double zuladung) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.leistung = leistung;
        this.reifen = reifen;
        this.zuladung = zuladung;
    }
    
    /**
     * Gibt die Marke des LKWs zurück.
     * @return marke Marke des LKWs
     */
    public String getMarke() {
        return marke;
    }
    
    /**
     * Gibt das Modell des LKWs zurück.
     *
     * @return das Modell des LKWs
     */
    public String getModell() {
        return modell;
    }

    /**
     * Gibt das Baujahr des LKWs zurück.
     *
     * @return das Baujahr des LKWs
     */
    public int getBaujahr() {
        return baujahr;
    }

    /**
     * Gibt die Leistung des LKWs in PS zurück.
     *
     * @return die Leistung des LKWs
     */

    public int getLeistung(){
        return leistung;
    }

    /**
     * Gibt die Anzahl der Reifen des LKWs zurück.
     *
     * @return die Anzahl der Reifen des LKWs
     */
    public int getReifen() {
        return reifen;
    }

    /**
     * Gibt die Zuladung des LKWs in Tonnen zurück.
     *
     * @return die Zuladung des LKWs
     */
    public double getZuladung() {
        return zuladung;
    }


    
    /**
     * Setzt die Marke des LKWs.
     *
     * @param marke die neue Marke des LKWs
     */
    public void setMarke(String marke) {
        this.marke = marke;
    }
    
    /**
     * Setzt das Modell des LKWs.
     *
     * @param modell das neue Modell des LKWs
     */
    public void setModell(String modell) {
        this.modell = modell;
    }
    
    /**
     * Setzt das Baujahr des LKWs.
     *
     * @param baujahr das neue Baujahr des LKWs
     */
    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    /**
     * Setzt die Leistung des LKWs in PS.
     *
     * @param leistung die neue Leistung des LKWs
     */
    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    /**
     * Setzt die Anzahl der Reifen des LKWs.
     *
     * @param reifen die neue Anzahl der Reifen des LKWs
     */
    public void setReifen(int reifen) {
        this.reifen = reifen;
    }

    /**
     * Setzt die Zuladung des LKWs in Tonnen.
     *
     * @param zuladung die neue Zuladung des LKWs
     */
    public void setZuladung(double zuladung) {
        this.zuladung = zuladung;
    }
    
    /**
     * Startet das LKW und gibt eine entsprechende Nachricht auf der Konsole aus.
     */
    @Override
    public void starten() {
        System.out.println("Das LKW startet.");
    }
    
    /**
     * Stoppt das LKW und gibt eine entsprechende Nachricht auf der Konsole aus.
     */
    @Override
    public void stoppen() {
        System.out.println("Das LKW stoppt.");
    }
}