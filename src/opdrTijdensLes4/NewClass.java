package opdrTijdensLes4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * * Tools | Templates and open the template in the editor
 *
 * @author 0775768 <Hesam.Zarza>
 */
public class NewClass {
        public static int i;
        public int droll = 2;
//        private String a = "fsad";
//	private String b;
//	private int c;

//	public void setA(String a) {
//		this.a = a;
//	}
        
    public static void main(String[] args) {
        int sum=0;
        for(int i = 2;
                i<7; 
                i+=2)
        {
            System.out.println(i);
            System.out.println(sum);
            sum += i;
            System.out.println(sum);
        }
        System.out.println(sum);
                
        NewClass a1 = new NewClass();
		//a1.i = 1;
                NewClass a2 = new NewClass();
                System.out.println("geef mij je waarde" + NewClass.i+ a2.droll);
        
        
//        Persoon kan niet gecast worden naar onderliggende extend
//        (parent kan geen child worden)
//        Student s = (Student) new Persoon();
//        s.naamUitPersoon = "Obama";
//
//        deze zal niet werken omdat student als persoon wordt gecast en in persoon zit de variabel niet van student 
//        Persoon p = (Persoon) new Student();
//        p.studentnummerUitStudent = "0123456";
        
//        Persoon kan niet als Student geinstantieerd worden 
//        Student s = new Persoon();
//        ((Student) s).naam = "Clinton";
        
        
        Persoon p = new Student();
        ((Student) p).studentnummerUitStudent = "0123456";


        
        System.out.println(2);
        System.out.println(2 + p.naamUitPersoon + ((Student) p).studentnummerUitStudent);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(200, 100);

        JButton button = new JButton("Klik mij!");

        frame.add(BorderLayout.NORTH, button);

        button.addActionListener((ActionEvent e) -> {
            System.out.println("fsfsfsfs");
        });
        button.addActionListener(e -> {
            System.out.println("hehehehh");
        });

    }
}

class MijnActie implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Er is geklikt!!!");
    }
}
