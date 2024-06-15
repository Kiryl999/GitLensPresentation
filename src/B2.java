package src;

/**
 * Die Klasse B2 repräsentiert einen spezifischen Flugzeugtyp, der von der abstrakten Klasse Flugzeug erbt.
 * Diese Klasse fügt eine zusätzliche Eigenschaft hinzu, nämlich die Anzahl der Bomben, die das Flugzeug tragen kann.
 */
public class B2 extends Flugzeug {
    private int anzahlBomben;

    /**
     * Konstruktor zur Initialisierung eines neuen B2-Objekts mit den angegebenen Attributen.
     *
     * @param modell Das Modell des Flugzeugs.
     * @param spannweite Die Spannweite des Flugzeugs.
     * @param reichweite Die maximale Reichweite des Flugzeugs.
     * @param reiseGeschwindigkeit Die Reisegeschwindigkeit des Flugzeugs.
     * @param antrieb Der Antriebstyp des Flugzeugs.
     * @param anzahlBomben Die Anzahl der Bomben, die das Flugzeug tragen kann.
     */
    public B2(String modell, double spannweite, int reichweite, int reiseGeschwindigkeit, Antrieb antrieb, int anzahlBomben) {
        super(modell, spannweite, reichweite, reiseGeschwindigkeit, antrieb);
        this.anzahlBomben = anzahlBomben;
    }

    /**
     * Gibt die Anzahl der Bomben zurück, die das Flugzeug tragen kann.
     *
     * @return Die Anzahl der Bomben.
     */
    public int getAnzahlBomben() {
        return anzahlBomben;
    }

    /**
     * Setzt die Anzahl der Bomben, die das Flugzeug tragen kann.
     *
     * @param anzahlBomben Die neue Anzahl der Bomben.
     */
    public void setAnzahlBomben(int anzahlBomben) {
        this.anzahlBomben = anzahlBomben;
    }

    /**
     * Methode, die den Startvorgang des B2-Flugzeugs simuliert.
     */
    @Override
    public void takeOff() {
        System.out.println("B2 hebt ab.");
    }

    /**
     * Methode, die den Landevorgang des B2-Flugzeugs simuliert.
     */
    @Override
    public void landen() {
        System.out.println("B2 landet.");
    }
}
