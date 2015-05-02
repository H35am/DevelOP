
package infOpdr_4;

/**
 *
 * @author 0775768 <Hesam.Zarza>
 */
public class Octaeder extends Vorm{
    
    public Octaeder(){
        super();
    }
    
    public Octaeder(double x){
        super(x);
    }
    
    @Override
    public double inhoud(){
        double eenDerde = (double)1/3;
        double wortel = Math.sqrt(2);
        double kwadraat = Math.pow(super.getRibLengte(), 3);
        double som = eenDerde * wortel * kwadraat;
        return som;
    }
    
    @Override
    public double oppervlakte(){
        //formule 2√3r2
        double wortel = Math.sqrt(3);
        double kwadraat = Math.pow(super.getRibLengte(), 2);
        return 2 * wortel * kwadraat;
        
    }
    
    @Override
    public void print(){
        System.out.println("Naam: Octaeder");
        System.out.println("Inhoud is: " + inhoud());
        System.out.println("Oppervlakte is: " + oppervlakte());
        
    }
    
}
