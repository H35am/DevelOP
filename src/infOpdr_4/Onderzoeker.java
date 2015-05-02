package infOpdr_4;

/**
 * * Tools | Templates and open the template in the editor
 *
 * @author 0775768 <Hesam.Zarza>
 */
public class Onderzoeker {

    private boolean keur(Vorm[] v) {
        /**
         * Mag niet leeg zijn if statement van return null als het v leeg is
         */
        //return v != null;

        /**
         * array mag niet leeg zijn en moet naar objecten verwijzen enn van deze
         * werkt maar welke
         */
        for (Vorm a : v) {
            if (a == null) {
                return false;
            }

        }

        /**
         * of deze
         */
        int arrayLengte = v.length;
        /**
         * deze is vervangen if (arrayLengte != 0) { return false; } return
         * true; door hier onder
         */
        return arrayLengte == 0;

    }

    public void maxInhoud(Vorm[] v) {
        Vorm groteInhoud = null;

        for (Vorm a : v) {
            if (groteInhoud == null) {
                groteInhoud = a;
            } else {
                if (groteInhoud.inhoud() < a.inhoud()) {
                    groteInhoud = a;
                }
            }
        }
        if (groteInhoud != null) {
            System.out.println("Het object met de grootste inhoud is:");
            groteInhoud.print();

        }

    }

    public void miniOppervlakte(Vorm[] v) {
        Vorm kleineOppervlak = null;

        for (Vorm a : v) {
            if (kleineOppervlak == null) {
                kleineOppervlak = a;
            } else {
                if (kleineOppervlak.oppervlakte() > a.oppervlakte()) {
                    kleineOppervlak = a;
                }
            }
        }

        if (kleineOppervlak != null) {
            System.out.println("Het object met de kleinste oppervlakte is:");
            kleineOppervlak.print();
        }

    }

    public void maxVerhouding(Vorm[] v) {

        Vorm verhouding = null;

        for (Vorm a : v) {
            if (verhouding == null) {
                verhouding = a;
            } else {
                double x = verhouding.oppervlakte() - verhouding.inhoud();
                double y = a.oppervlakte() - a.inhoud();
                if (verhouding.oppervlakte() - verhouding.inhoud() < a.oppervlakte() - a.inhoud()) {
                    verhouding = a;
                }
            }
        }

        if (verhouding != null) {
            System.out.println("Het object die grootste verhouding heeft:");
            verhouding.print();
        }

    }

}
