package src;

/**
 * Die abstrakte Klasse Flugzeug repräsentiert ein generisches Flugzeug mit grundlegenden Eigenschaften 
 * wie Modell, Spannweite, Reichweite, Reisegeschwindigkeit und Antriebstyp.
 */
public abstract class Flugzeug {
    private String modell;
    private double spannweite;
    private int reichweite;
    private int reiseGeschwindigkeit;
    private Antrieb antrieb;

    /**
     * Der Enum-Typ Antrieb definiert die verschiedenen Antriebsarten eines Flugzeugs.
     */
    public enum Antrieb {PROP, JET, TURBOPROP};
    
    /**
     * Konstruktor zur Initialisierung eines neuen Flugzeug-Objekts mit den angegebenen Attributen.
     *
     * @param modell Das Modell des Flugzeugs.
     * @param spannweite Die Spannweite des Flugzeugs.
     * @param reichweite Die maximale Reichweite des Flugzeugs.
     * @param reiseGeschwindigkeit Die Reisegeschwindigkeit des Flugzeugs.
     * @param antrieb Der Antriebstyp des Flugzeugs.
     */
    public Flugzeug(String modell, double spannweite, int reichweite, int reiseGeschwindigkeit, Antrieb antrieb) {
        this.modell = modell;
        this.spannweite = spannweite;
        this.reichweite = reichweite;
        this.reiseGeschwindigkeit = reiseGeschwindigkeit;
        this.antrieb = antrieb;
    }

    /**
     * Gibt das Modell des Flugzeugs zurück.
     *
     * @return Das Modell des Flugzeugs.
     */
    public String getModell() {
        return modell;
    }

    /**
     * Setzt das Modell des Flugzeugs.
     *
     * @param modell Das neue Modell des Flugzeugs.
     */
    public void setModell(String modell) {
        this.modell = modell;
    }

    /**
     * Gibt die Spannweite des Flugzeugs zurück.
     *
     * @return Die Spannweite des Flugzeugs.
     */
    public double getSpannweite() {
        return spannweite;
    }

    /**
     * Setzt die Spannweite des Flugzeugs.
     *
     * @param spannweite Die neue Spannweite des Flugzeugs.
     */
    public void setSpannweite(double spannweite) {
        this.spannweite = spannweite;
    }

    /**
     * Gibt die Reichweite des Flugzeugs zurück.
     *
     * @return Die Reichweite des Flugzeugs.
     */
    public int getReichweite() {
        return reichweite;
    }

    /**
     * Setzt die Reichweite des Flugzeugs.
     *
     * @param reichweite Die neue Reichweite des Flugzeugs.
     */
    public void setReichweite(int reichweite) {
        this.reichweite = reichweite;
    }

    /**
     * Gibt die Reisegeschwindigkeit des Flugzeugs zurück.
     *
     * @return Die Reisegeschwindigkeit des Flugzeugs.
     */
    public int getReiseGeschwindigkeit() {
        return reiseGeschwindigkeit;
    }

    /**
     * Setzt die Reisegeschwindigkeit des Flugzeugs.
     *
     * @param reiseGeschwindigkeit Die neue Reisegeschwindigkeit des Flugzeugs.
     */
    public void setReiseGeschwindigkeit(int reiseGeschwindigkeit) {
        this.reiseGeschwindigkeit = reiseGeschwindigkeit;
    }

    /**
     * Gibt den Antriebstyp des Flugzeugs zurück.
     *
     * @return Der Antriebstyp des Flugzeugs.
     */
    public Antrieb getAntrieb() {
        return antrieb;
    }

    /**
     * Setzt den Antriebstyp des Flugzeugs.
     *
     * @param antrieb Der neue Antriebstyp des Flugzeugs.
     */
    public void setAntrieb(Antrieb antrieb) {
        this.antrieb = antrieb;
    }

    /**
     * Methode, die den Flugstatus des Flugzeugs anzeigt.
     *
     * @param isFlying Ein boolean-Wert, der angibt, ob das Flugzeug fliegt oder nicht.
     */
    public void fly(boolean isFlying) {
        if(isFlying) {
            System.out.println("Das Flugzeug fliegt.");
        } else {
            System.out.println("Das Flugzeug fliegt nicht.");
        }
    }

    /**
     * Abstrakte Methode zum Starten des Flugzeugs. Muss in Unterklassen implementiert werden.
     */
    public abstract void takeOff();

    /**
     * Abstrakte Methode zum Landen des Flugzeugs. Muss in Unterklassen implementiert werden.
     */
    public abstract void landen();
}
