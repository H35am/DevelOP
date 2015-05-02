/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infOpdr_1;

public class Auto {

    private String kenteken;
    private String kleur;
    private String merk;
    private String type;
    private int maxSnelheid;
    private int deuren;
    private int gewicht;
    private int prijs;

    // setMaxSnelheid is een method die de waarde in maxSnelheid opslaat(hierboven) 
    public void setMaxSnelheid(int maxSnelheid) {
        this.maxSnelheid = maxSnelheid;
    }

    public void setDeuren(int deuren) {
        if (deuren < 0) {
            System.out.println("TE LAGE WAARDE");
        } else {
            this.deuren = deuren;
        }
    }

    public void setGewicht(int gewicht) {
        if (gewicht < 200) {
            System.out.println("Te lage waarde!");
        } else {
            this.gewicht = gewicht;
        }
    }

    public void setPrijs(int prijs) {
        if (prijs < 1000) {
            System.out.println("Te lage prijs!");
        } else {
            this.prijs = prijs;
        }
    }

    public void setKenteken(String kenteken) {
        this.kenteken = kenteken;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Hier wordt de waarde van "deuren" terug gegeven 
    public int getDeuren() {
        return deuren;
    }

    public int getGewicht() {
        return gewicht;
    }
    
    public int getMaxSnelheid(){
        return maxSnelheid;
}
    
    public void print() {

        if (kenteken != null) {
            System.out.println(String.format("Kenteken is: %s", kenteken));
        } else {
            System.out.println("Kenteken is niet ingevuld!");
        }

        if (kleur != null) {
            System.out.println("Kleur is: " + kleur);
        }
        if (merk != null) {
            System.out.println("Merk is: " + merk);
        }
        if (type != null) {
            System.out.println("Type is: " + type);
        }
        if (maxSnelheid != 0) {
            System.out.println("Max snelheid is: " + maxSnelheid + "KM/h.");
        }
        if (deuren != 0) {
            System.out.println("Aantal deuren is: " + deuren);
        }
        if (gewicht != 0) {
            System.out.println("Het gewicht is: " + gewicht + " KG.");
        }
        if (prijs != 0) {
            System.out.println("Prijs is: €" + prijs);
        }

    }

}
