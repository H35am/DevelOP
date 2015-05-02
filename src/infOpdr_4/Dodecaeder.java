package infOpdr_4;

/**
 * * Tools | Templates and open the template in the editor
 *
 * @author 0775768 <Hesam.Zarza>
 */
public class Dodecaeder extends Vorm {

    public Dodecaeder() {
        super();
    }

    public Dodecaeder(double x) {
        super(x);
    }

    @Override
    public double inhoud() {
        //formule 1/4 (15 + 7√5)r3   
        double vierde = 1.0 / 4.0;
        double eersteSet = 15.0 + (7.0 * Math.sqrt(5));
        double kwadraat = Math.pow(getRibLengte(), 3);
        return vierde * eersteSet * kwadraat;

    }

    @Override
    public double oppervlakte() {
        //formule 3 * q25 + 10√5r2
        double eersteOpsomming = Math.sqrt(5);
        double tweedeOpsomming = 10.0 * eersteOpsomming;
        double opsomming = 25.0 + tweedeOpsomming;
        double totaal = 3.0 * Math.sqrt(opsomming) * Math.pow(super.getRibLengte(), 2);
        return totaal;

    }

    @Override
    public void print() {

        System.out.println("Naam: Dodecaeder");
        System.out.println("Inhoud is: " + inhoud());
        System.out.println("Oppervlakte is: " + oppervlakte());
    }

}
