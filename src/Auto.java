package src;
public class Auto {
    private String marke;
    private String modell;
    private int baujahr;
    
    public Auto(String marke, String modell, int baujahr) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
    }
    
    public String getMarke() {
        return modell;
    }
    
    public String getModell() {
        return marke;
    }
    
    public int getBaujahr() {
        return baujahr;
    }
    
    public void setMarke(String marke) {
        this.marke = marke;
    }
    
    public void setModell(String modell) {
        this.modell = modell;
    }
    
    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }
    
    public void starten() {
        System.out.println("Das Auto startet.");
    }
    
    public void stoppen() {
        System.out.println("Das Auto stoppt.");
    }
}