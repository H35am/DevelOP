
package infOpdr2_1;

import infOpdr2_1.ExceptionClasses.EngineException;

/**
 * * Tools | Templates and open the template in the editor 
 * @author 0775768 <Hesam.Zarza>
 */
public class Engine {
   
    private boolean itsOk = true;
    
    /**
     * 
     * @param itsOk 
     */
    public void setItsOk(boolean itsOk){
        this.itsOk = itsOk;
    }
    
    /**
     * 
     * @return 
     */
     public boolean isItsOk(){
        return itsOk;
    }  
   
     /**
      * 
      * @throws EngineException 
      */
    public void calculate() throws EngineException{
        
        if(0.0001 >= Math.random()){ 
            setItsOk(false);
            throw new EngineException("Engine kapot.");
           
            
        
          }
        
    }

   

}
