
package infOpdr2_1;

import infOpdr2_1.ExceptionClasses.PilotException;

/**
 * * Tools | Templates and open the template in the editor 
 * @author 0775768 <Hesam.Zarza>
 */
public class Pilot {
    private boolean itsOk = true;
    
    public void calculate() throws PilotException{
        
        if (0.001 >= Math.random()){
            setItsOk(false);
            throw new PilotException("Slaap gevallen piloot!");
        }
        
    }

    /**
     * @return the itsOk
     */
    public boolean isItsOk() {
        return itsOk;
    }

    /**
     * @param itsOk the itsOk to set
     */
    public void setItsOk(boolean itsOk) {
        this.itsOk = itsOk;
    }
    
}
