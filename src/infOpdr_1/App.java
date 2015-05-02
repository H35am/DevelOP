/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infOpdr_1;

import java.util.ArrayList;

public class App {
 
        
    public static void main(String[] args) {
        
        
        
        //BMW
        Auto autoBmw = new Auto();

        autoBmw.setKleur("Blauw");
        autoBmw.setMerk("BMW");
        autoBmw.setType("318");
        autoBmw.setMaxSnelheid(214);
        autoBmw.setPrijs(35000);
        autoBmw.setDeuren(4);
        autoBmw.setGewicht(3000);
        autoBmw.setKenteken("35-xf-kk");

        //Kia
        Auto autoKia = new Auto();

        autoKia.setKleur("Rood");
        autoKia.setMerk("Kia");
        autoKia.setType("Picanto");
        autoKia.setMaxSnelheid(163);
        autoKia.setPrijs(12000);
        autoKia.setDeuren(2);
        autoKia.setGewicht(980);
        autoKia.setKenteken("kh-45-jj");

        //ford
        Auto autoFord = new Auto();

        autoFord.setKleur("Zwart");
        autoFord.setMerk("Ford");
        autoFord.setType("Mondeo");
        autoFord.setMaxSnelheid(225);
        autoFord.setPrijs(25000);
        autoFord.setDeuren(5);
        autoFord.setGewicht(1506);
        autoFord.setKenteken("6-kjn-85");

        //opdracht 1.2
        System.out.println("Eerste auto: ");
        autoKia.print();
        System.out.println(" ");
        System.out.println("Tweede auto: ");
        autoBmw.print();
        System.out.println(" ");
        System.out.println("Derde auto: ");
        autoFord.print();
        System.out.println(" ");

        //opdracht 1.3
        Auto[] autos = new Auto[5];

        autos[0] = new Auto();
        autos[0].setMerk("Mercedes");
        autos[0].setMaxSnelheid(283);
        autos[0].print();
        System.out.println(" ");

        autos[1] = new Auto();
        autos[1].setMerk("Honda");
        autos[1].setMaxSnelheid(236);
        autos[1].print();
        System.out.println(" ");

        autos[2] = new Auto();
        autos[2].setMerk("BMW");
        autos[2].setMaxSnelheid(287);
        autos[2].print();
        System.out.println(" ");

        autos[3] = new Auto();
        autos[3].setMerk("Opel");
        autos[3].setMaxSnelheid(254);
        autos[3].print();
        System.out.println(" ");

        autos[4] = new Auto();
        autos[4].setMerk("Bugatti");
        autos[4].setMaxSnelheid(389);
        autos[4].print();
        System.out.println(" ");

        System.out.println("De snelste auto is: ");
        vindSnelsteAuto(autos);
        System.out.println(" ");

    }

    //opdracht 1.4
    public static void vindSnelsteAuto(Auto[] snelsteAuto) {
      
        Auto snelleAuto = null;

        for (Auto a : snelsteAuto) {
            if (snelleAuto == null) {
                snelleAuto = a;
            } else {
                if (snelleAuto.getMaxSnelheid() < a.getMaxSnelheid()) {
                    snelleAuto = a;
                }
            }
        }
        if (snelleAuto != null) {
            snelleAuto.print();
        }

    }

}
