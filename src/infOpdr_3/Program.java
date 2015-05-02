/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infOpdr_3;

import java.util.ArrayList;

/**
 *
 * @author 0775768 <Hesam.Zarza>
 */
public class Program {

    public static void main(String[] args) {
        
        System.out.println("Dit is opdracht 3");
        System.out.println("  ");
        //arraylist waar alle vervoersmiddellen uit eindelijk in belanden
        ArrayList<Vervoersmiddel> vervoersmiddellen = new ArrayList<>();

        Fiets gazzelle = new Fiets();
        gazzelle.setGewicht(10);
        gazzelle.setMerk("Gazelle");
        gazzelle.setType("City Bike");
        gazzelle.setVersnellingen(8);
        gazzelle.setKleur("Rood");
        gazzelle.setPrijs(1200);
        gazzelle.setZitplaats(1);
        //wordt toegevoegd aan de arraylist
        vervoersmiddellen.add(gazzelle);

        Fiets sparta = new Fiets();
        sparta.setGewicht(12);
        sparta.setMerk("Sparta");
        sparta.setType("City bike");
        sparta.setVersnellingen(3);
        sparta.setKleur("wit");
        sparta.setPrijs(1300);
        sparta.setZitplaats(1);
        vervoersmiddellen.add(sparta);

        Racefiets peugeot = new Racefiets();
        peugeot.setGewicht(6);
        peugeot.setSoortFrame("Carbon");
        peugeot.setSponsor("Peugeot");
        peugeot.setKleur("Blauw");
        peugeot.setPrijs(5000);
        peugeot.setMerk("Peugeot");
        peugeot.setType("Race fiets");
        peugeot.setVersnellingen(21);
        peugeot.setZitplaats(1);
        vervoersmiddellen.add(peugeot);

        Racefiets giant = new Racefiets();
        giant.setGewicht(3);
        giant.setSoortFrame("Carbon");
        giant.setSponsor("Planet");
        giant.setKleur("Cobalt");
        giant.setPrijs(6000);
        giant.setMerk("Giant");
        giant.setType("Race fiets");
        giant.setVersnellingen(21);
        giant.setZitplaats(1);
        vervoersmiddellen.add(giant);

        Auto fiat = new Auto();
        fiat.setGewicht(963);
        fiat.setKleur("Rood");
        fiat.setMerk("Fiat");
        fiat.setType("Auto");
        fiat.setDeuren(3);
        fiat.setPrijs(20000);
        fiat.setZitplaats(4);
        vervoersmiddellen.add(fiat);

        Auto kia = new Auto();
        kia.setGewicht(1003);
        kia.setKleur("Wit");
        kia.setMerk("Kia");
        kia.setType("Auto");
        kia.setDeuren(5);
        kia.setPrijs(15000);
        kia.setZitplaats(5);
        vervoersmiddellen.add(kia);

        RaceAuto bmw = new RaceAuto();
        bmw.setGewicht(833);
        bmw.setMerk("BMW");
        bmw.setType("Race auto");
        bmw.setDeuren(2);
        bmw.setPrijs(100506);
        bmw.setAantalSponsers(3);
        bmw.setSoortBrandstof("Kerosin");
        bmw.setKleur("Zwart");
        bmw.setZitplaats(2);
        vervoersmiddellen.add(bmw);

        RaceAuto audi = new RaceAuto();
        audi.setGewicht(8500);
        audi.setMerk("Audi");
        audi.setType("Race auto");
        audi.setSoortBrandstof("Ethanol");
        audi.setAantalSponsers(4);
        audi.setDeuren(2);
        audi.setKleur("Wit");
        audi.setPrijs(150000);
        audi.setZitplaats(2);
        vervoersmiddellen.add(audi);

        Vervoersmiddel bus = new Vervoersmiddel();
        bus.setGewicht(3000);
        bus.setType("Bus");
        bus.setKleur("Geel");
        bus.setPrijs(6999.50);
        bus.setZitplaats(20);
        vervoersmiddellen.add(bus);

        Vervoersmiddel scooter = new Vervoersmiddel();
        scooter.setGewicht(100);
        scooter.setType("Scooter");
        scooter.setKleur("Zwart");
        scooter.setPrijs(1499);
        scooter.setZitplaats(2);
        vervoersmiddellen.add(scooter);

        System.out.println("Het zwaarste voertuig is:");
        //Method vinzwaarsteGewicht wordt aangeroepen en stuurt vervoersmiddellen arraylist  
        vindZwaarsteGewicht(vervoersmiddellen);
        System.out.println("  ");
        System.out.println("Het lichtste voertuig is:");
        vindLichtsteGewicht(vervoersmiddellen);
    }
    
    //Method die het zwaarste voertuig vindt en uiprint
    public static void vindZwaarsteGewicht(ArrayList<Vervoersmiddel> zwareVervoersmiddel) {
        //vervoersmiddel wordt op null gezet
        Vervoersmiddel vervoersmiddel = null;
        //Door een for each loop kijken we telkens naar het zwaarste voertuig uit de arraylist, 
        //dit wordt zo vaak herhaald als de lengte van de arraylist
        for (Vervoersmiddel v : zwareVervoersmiddel) {
            //hierwordt het eerste vervoersmiddel die null is op v gezet 
            if (vervoersmiddel == null) {
                vervoersmiddel = v;
            } else {
                //hier wordt het gewicht van twee voertuigen vergeleken en zwaarste wordt overgeschreven
                if (vervoersmiddel.getGewicht() < v.getGewicht()) {
                    vervoersmiddel = v;
                }
            }

        }
        //hier worden de gegevens van het voertuig getoond
        if (vervoersmiddel != null) {
          
           vervoersmiddel.print();
        }

    }
    //Method die het lichtste voertuig vindt en uiprint
    public static void vindLichtsteGewicht(ArrayList<Vervoersmiddel> lichteVervoersmiddel) {
        Vervoersmiddel vervoersmiddel = null;
        //Door een for each loop kijken we telkens naar het lichtste voertuig uit de arraylist, 
        //dit wordt zo vaak herhaald als de lengte van de arraylist
        for (Vervoersmiddel v : lichteVervoersmiddel) {
            if (vervoersmiddel == null) {
                vervoersmiddel = v;
            } else {
                if (vervoersmiddel.getGewicht() > v.getGewicht()) {
                    vervoersmiddel = v;
                }
            }

        }
        //hier worden de gegevens van het voertuig getoond
        if (vervoersmiddel != null) {
            vervoersmiddel.print();
        }

    }
}
