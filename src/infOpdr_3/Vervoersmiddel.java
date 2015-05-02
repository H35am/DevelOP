/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infOpdr_3;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author 0775768 <Hesam.Zarza>
 */
public class Vervoersmiddel {
    
    private String kleur;
    private int zitplaats;
    private int gewicht;
    private double prijs;
    private String type;
    

        /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    
    /**
     * @return the kleur
     */
    public String getKleur() {
        return kleur;
    }

    /**
     * @param kleur the kleur to set
     */
    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    /**
     * @return the zitplaats
     */
    public int getZitplaats() {
        return zitplaats;
    }

    /**
     * @param zitplaats the zitplaats to set
     */
    public void setZitplaats(int zitplaats) {
        this.zitplaats = zitplaats;
    }

    /**
     * @return the gewicht
     */
    public int getGewicht() {
        return gewicht;
    }

    /**
     * @param gewicht the gewicht to set
     */
    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    /**
     * @return the prijs
     */
    public double getPrijs() {
        return prijs;
    }

    /**
     * @param prijs the prijs to set
     */
    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }
    
    public void print(){
        System.out.println(String.format("Het type voertuig is: %s", type));
        System.out.println(String.format("De kleur is: %s", kleur));
        System.out.println(String.format("Heeft %s zitplaatsen.", zitplaats));
        System.out.println(String.format("Het gewicht is %sKG.", gewicht));
        Locale nl_NL = new Locale("nl_NL");
        NumberFormat numberFormatter = NumberFormat.getNumberInstance(nl_NL);
        System.out.println(String.format("Kost %s Euro ", numberFormatter.format(prijs)));
        
    }


    
    
}
