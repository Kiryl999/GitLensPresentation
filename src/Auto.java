package src;
public class Auto implements Fahrzeug{
    private String marke;
    private String modell;
    private int baujahr;
    private int leistung;
    
    public Auto(String marke, String modell, int baujahr, int leistung) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.leistung = leistung;
    }
    
    public String getMarke() {
        return marke;
    }
    
    public String getModell() {
        return modell;
    }
    
    public int getBaujahr() {
        return baujahr;
    }

    public int getLeistung(){
        return leistung;
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

    public void setLeistung(int leistung){
        this.leistung = leistung;
    }
    
    @Override
    public void starten() {
        System.out.println("Das Auto startet.");
    }
    
    @Override
    public void stoppen() {
        System.out.println("Das Auto stoppt.");
    }
}