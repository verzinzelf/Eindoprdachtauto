/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package autopack;

import java.util.*;

public class Autooverzicht {
    String html ="";
    private ArrayList<Auto> array;
    
    public Autooverzicht(){ 
        array = new ArrayList<Auto>();
    }
    
    public void addAuto(){
        array.add(new Auto("auto1.jpg","auto1","type1","200pk", "5000cc", "1200kg" ));
        array.add(new Auto("auto2.jpg","auto2","type2","200pk", "5000cc", "1200kg" ));
        array.add(new Auto("auto3.jpg","auto3","type3","200pk", "5000cc", "1200kg" ));
    }
    
    
    public String maakPagina(){
         for(Auto auto : array)
        {
            html += "<div class=\"resultbox\">"
                + "<div class=\"eersterij\">"
                + auto.getMerk() + " " + auto.getType() + "<br />"
                + "<img src=" + auto.getPlaatje() + ">"
                + "</div>"
                + "<div class=\"tweederij\">"
                + "<label for=\"merk\">      merk: "     + auto.getMerk()  + "</label><br />"
                + "<label for=\"model\">     Type: "    + auto.getType()  + "</label><br />"
                + "<label for=\"brandstof\"> vermogen: "+ auto.getVermogen() + "</label><br />"
                + "<label for=\"jaarbouw\">  Cilinderinhoud: " + auto.getCilinderinhoud()  + "</label><br />"
                + "<label for=\"prijs\">     Gewicht: "    + auto.getGewicht() + "</label><br />"
                + "</div>"
                + "</div>";
        }
        return html;
    }
    
}
