package src;

/**
 * Die Klasse LKW erstellt ein LKW mit verschiedenen Eigenschaften wie marke, etc.
 */
public class LKW extends Fahrzeug{
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
        super(marke, modell, baujahr, leistung);
        this.reifen = reifen;
        this.zuladung = zuladung;
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