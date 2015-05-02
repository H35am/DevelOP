package infOpdr_4;

/**
 * * Tools | Templates and open the template in the editor
 *
 * @author 0775768 <Hesam.Zarza>
 */
public class Icosaeder extends Vorm {

    public Icosaeder() {
        super();
    }

    public Icosaeder(double x) {
        super(x);
    }

    @Override
    public double inhoud() {
        //5 /12 (3 + √5)r3
        double vierde = 5.0 / 12.0;
        double eersteSet = 3.0 + Math.sqrt(5);
        double kwadraat = Math.pow(super.getRibLengte(), 3);
        return vierde * eersteSet * kwadraat;
    }

    @Override
    public double oppervlakte() {
        //5√3r2
        return 5 * Math.sqrt(3) * Math.pow(super.getRibLengte(), 2);
                
    }

    @Override
    public void print() {
        System.out.println("Naam: Icosaeder");
        System.out.println("Inhoud is: " + inhoud());
        System.out.println("Oppervlakte is: " + oppervlakte());
    }

}
