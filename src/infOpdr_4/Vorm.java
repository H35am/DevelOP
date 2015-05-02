package infOpdr_4;

/**
 *
 * @author 0775768 <Hesam.Zarza>
 */
public abstract class Vorm {

    /**
     * Constructor die standaard ribLengte op 1 zet
     */
    public Vorm() {
        //kan ook zo setRibLengte(1); 
        this.ribLengte = 1;
    }

    /**
     *
     * @param x zorgt ervoor dat ribLengte ingevulde waarde krijgt
     */
    public Vorm(double x) {
        this.ribLengte = x;
    }

    private double ribLengte;

    /**
     *
     * @return ribLengte
     */
    public double getRibLengte() {
        return ribLengte;
    }

    /**
     *
     * @param ribLengte setter
     */
    public void setRibLengte(double ribLengte) {
        this.ribLengte = ribLengte;
    }

    /**
     * Neem in de klasse de signatuur van de abstracte methode public void
     * print() op. Deze methode drukt de naam, alsmede de riblengte, oppervlakte
     * en inhoud van deze vorm overzichtelijk op het scherm af
     *
     * @return
     */
    abstract public double inhoud();

    abstract public double oppervlakte();

    abstract public void print();

}
