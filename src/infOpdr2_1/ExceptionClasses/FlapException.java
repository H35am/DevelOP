
package infOpdr2_1.ExceptionClasses;

/**
 * * Tools | Templates and open the template in the editor 
 * @author 0775768 <Hesam.Zarza>
 */
public class FlapException extends Exception{
    public FlapException(){
        super();
    }
    
    public FlapException(String message){
        super(message);
    }
    
    public void vluchtNummerPrint(int vluchtNummer){
        System.out.println("Vluchtnummer: " + vluchtNummer);
    }
}