package autopack;

/**
 *
 * @author Pascal
 */
public class Auto {
    private String plaatje, merk, type, vermogen, cilinderinhoud, gewicht;  
    
    public Auto(String plaatje, String merk, String type, String vermogen, String cilinderinhoud, String gewicht){
    this.plaatje = plaatje;
    this.merk = merk;
    this.type = type;
    this.vermogen = vermogen;
    this.cilinderinhoud = cilinderinhoud;
    this.gewicht = gewicht;
           
    }
    public String getPlaatje(){
        return plaatje;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public String getType(){
        return type;
    }
    
    public String getVermogen(){
        return vermogen;
    }
    
    public String getCilinderinhoud(){
        return cilinderinhoud;
    }
    
    public String getGewicht(){
        return gewicht;
    }
    
    
}
