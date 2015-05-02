/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infOpdr_4;

/**
 *
 * @author 0775768 <Hesam.Zarza>
 */
public class Tetraeder extends Vorm {
        public Tetraeder() {
        super();
    }

    public Tetraeder(double x) {
        super(x);
    }
    
    @Override
    public double inhoud() {
        double ribLengte = super.getRibLengte();
        double ribTotMacht = Math.pow(ribLengte, 3);
        double ribWortel = Math.sqrt(2);
        double deel = 1.0/12.0;
        double uitkomst = deel * ribTotMacht * ribWortel;
        return uitkomst;
    }

    @Override
    public double oppervlakte() {
        double ribLengte = super.getRibLengte();
        return Math.pow(ribLengte, 2) * Math.sqrt(3);
    }

    @Override
    public void print() {
        System.out.println("Naam: Tetraeder.");
        System.out.println("Inhoud: " + inhoud());
        System.out.println("Oppervlakte: " + oppervlakte());
    }

    
    
}
