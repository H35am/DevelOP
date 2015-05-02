
package infOpdr2_1.ExceptionClasses;

/**
 * * Tools | Templates and open the template in the editor 
 * @author 0775768 <Hesam.Zarza>
 */
public class PilotException extends Exception{
    public PilotException(){
        super();
    }
    
    public PilotException(String message){
        super(message);
    }
    
    public void vluchtNummerPrint(int vluchtNummer){
        System.out.println("Vluchtnummer: " + vluchtNummer);
    }
}