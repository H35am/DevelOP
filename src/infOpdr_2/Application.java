package infOpdr_2;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class Application {

    public static void main(String[] args) {
        System.out.println("dit is opdracht 2");

        //Arraylist aanmaken voor hier beneden
        ArrayList<Doos> dozen = new ArrayList<>();
        //herhaal drie keer ofwel maak 3 dozen
        for (int i = 0; i < 3; i++) {
            Doos pakkage = new Doos();
            dozen.add(pakkage);
        }

        //Maak de band aan
        Band lopendeBand = new Band();
        //hier maken we de machine 
        Machine silicon = new Machine();
        silicon.setBand(lopendeBand);
        //uitlezen de dozen stapel
        for (Doos d : dozen) {
            //laat de machine doos pakken uit dozen
            silicon.setDoos(d);

            //hier maken we chip
            Random random = new Random();
            int num = random.nextInt(2) + 1;
            silicon.maakChip(num % 2 == 0 ? "Intel" : "AMD");
            silicon.printAdres(JOptionPane.showInputDialog("Wat is het bezorgadres?"));
            silicon.pakIn();
            silicon.zetopBand();
            Doos gegevensDoos = silicon.getDoos();
            gegevensDoos.printDoos();
        }

    }
}
