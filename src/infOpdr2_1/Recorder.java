package infOpdr2_1;

import infOpdr2_1.ExceptionClasses.CrashException;


/**
 * * Tools | Templates and open the template in the editor
 *
 * @author 0775768 <Hesam.Zarza>
 */
public class Recorder {
   
    public void simulate(int aantal){
        for (int i = 0; i < aantal; i++) {
            
            Airplane vliegtuig = new Airplane();
           
                try {
                    vliegtuig.flight(i);
                } catch (CrashException crashReport) {
                    System.out.println("vluchtnummer " + i);
                   System.out.println(crashReport.getMessage());
                }
            
            
            
        }
    }

}
