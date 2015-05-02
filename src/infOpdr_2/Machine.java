
package infOpdr_2;

import java.util.ArrayList;
import java.util.Random;

public class Machine {

    private Chip chip;
    private Doos doos;
    private Band band;
    private int aantal;
    private final ArrayList<Integer> uniekeNummers;

    //cunstructor heeft zelfde naam als de class.
    public Machine() {
        uniekeNummers = new ArrayList<>();
    }

    /**
     * @return the chip
     */
    public Chip getChip() {
        return chip;
    }

    /**
     * @param chip the chip to set
     */
    public void setChip(Chip chip) {
        this.chip = chip;
    }

    /**
     * @return the doos
     */
    public Doos getDoos() {
        return doos;
    }

    /**
     * @param doos the doos to set
     */
    public void setDoos(Doos doos) {
        this.doos = doos;
    }

    /**
     * @return the aantal
     */
    public int getAantal() {
        return aantal;
    }

    /**
     * @param aantal the aantal to set
     */
    public void setAantal(int aantal) {
        this.aantal = aantal;
    }

    //print aantal chips
    public void printGegevens() {
        System.out.println("Aantal gemaakte chips is: " + aantal);
    }

    //retourneert true als er een doos geladen 
    public boolean doosAanwezig() {
        return doos != null;
    }

    //stopt een chip in de doos
    public void pakIn() {
        doos.setChip(chip);
    }

    //plaatst de doos met chip op de lopende als de doos aanwezig is
    public void zetopBand() {
        if (doosAanwezig()) {
            band.setDoos(doos);
        } else {
            System.out.println("Doos niet aanwezig!");
        }
    }

    public Chip maakChip(String _type) {
        Chip chip = new Chip();
        chip.setType(_type);

        //komt van libary 
        //maakt een nieuwe unieke id aan
        Random rand = new Random();
        int chipNummer = rand.nextInt(9999);
        //maakt een nieuwe random nummer aamn als deze bestaat
        while (uniekeNummers.contains(chipNummer)) {
            chipNummer = rand.nextInt(9999);
        }

        chip.setNummer(chipNummer);

        aantal++;
        this.chip = chip;
        return chip;

    }

    // printAdres(String bezorgAdres); drukt het bezorgadres op de doos.
    public void printAdres(String bezorgAdres) {

        doos.setAdres(bezorgAdres);

    }

    /**
     * @return the band
     */
    public Band getBand() {
        return band;
    }

    /**
     * @param band the band to set
     */
    public void setBand(Band band) {
        this.band = band;
    }

}
