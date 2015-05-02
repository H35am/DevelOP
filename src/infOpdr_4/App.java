package infOpdr_4;

/**
 *
 * @author 0775768 <Hesam.Zarza>
 */
public class App {

    public static void main(String arg[]) {

        Vorm[] veelVlakSet1 = new Vorm[5];

        veelVlakSet1[0] = new Kubus();
        veelVlakSet1[1] = new Dodecaeder();
        veelVlakSet1[2] = new Icosaeder();
        veelVlakSet1[3] = new Octaeder();
        veelVlakSet1[4] = new Tetraeder();

        Vorm[] veelVlakSet2 = new Vorm[5];
        
        veelVlakSet2[0] = new Kubus(2.0);
        veelVlakSet2[1] = new Dodecaeder(2.0);
        veelVlakSet2[2] = new Icosaeder(2.0);
        veelVlakSet2[3] = new Octaeder(2.0);
        veelVlakSet2[4] = new Tetraeder(2.0);

        Vorm[] veelVlakSet3 = new Vorm[5];

        veelVlakSet3[0] = new Kubus(3.0);
        veelVlakSet3[1] = new Dodecaeder(3.0);
        veelVlakSet3[2] = new Icosaeder(3.0);
        veelVlakSet3[3] = new Octaeder(3.0);
        veelVlakSet3[4] = new Tetraeder(3.0);

        Onderzoeker test = new Onderzoeker();
        test.maxInhoud(veelVlakSet1);
        sop();
        test.miniOppervlakte(veelVlakSet2);
        sop();
        test.maxVerhouding(veelVlakSet1);
        sop();
        test.maxVerhouding(veelVlakSet2);
        sop();
        test.maxVerhouding(veelVlakSet3);

//        Icosaeder twintigVlak = new Icosaeder(6.0);
//        twintigVlak.print();
//        sop();
//
//        Dodecaeder twaalfVlak = new Dodecaeder(4.0);
//        twaalfVlak.print();
//        sop();
//
//        Octaeder achtHoek = new Octaeder(5.0);
//        achtHoek.print();
//        sop();
//
//        Tetraeder pyramid = new Tetraeder(4.0);
//        pyramid.print();
//        sop();
//
//        Kubus kubic = new Kubus(2.0);
//        kubic.print();
    }

    private static void sop() {
        System.out.println();
    }
}
