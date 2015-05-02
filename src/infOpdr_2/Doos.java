/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infOpdr_2;

public class Doos {

    private String adres;
    private Chip chip;

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Chip getChip() {
        return chip;
    }

    public void setChip(Chip chip) {
        this.chip = chip;
    }

    //public chip pakUit(); maakt de pointervariable chip gelijk aan null
    //en geeft een pointer terug naar de chip die in de doos zat.
    public Chip pakUit() {
        Chip tempChip = chip;
        chip = null;
        return tempChip;
    }

    //public void printDoos(); print het adres op de doos, alsmede alle
    //gegevens van de chip als er een chip in de doos zit.
    //    
    public void printDoos() {

        System.out.println(String.format("Het adres is %s", adres));
        if (chip != null) {
            System.out.println(String.format("Het type is %s en artikelnummer is %d", chip.getType(), chip.getNummer()));

        }

    }

}
