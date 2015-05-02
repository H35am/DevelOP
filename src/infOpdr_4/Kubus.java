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
class Kubus extends Vorm {

    public Kubus() {
        super();
    }

    public Kubus(double x) {
        super(x);
    }

    @Override
    public double inhoud() {
        double ribLengte = super.getRibLengte();
        return Math.pow(ribLengte, 3);
    }

    @Override
    public double oppervlakte() {
        double ribLengte = super.getRibLengte();
        double kwadraat = Math.pow(ribLengte, 2);
        double vlakken = 6;
        return kwadraat * vlakken;
    }

    @Override
    public void print() {
        System.out.println("Naam: Kubus");
        System.out.println("Inhoud is: " + inhoud());
        System.out.println("Oppervlakte is: " + oppervlakte());

    }

}
