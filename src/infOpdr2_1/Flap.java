package infOpdr2_1;

import infOpdr2_1.ExceptionClasses.FlapException;

/**
 * * Tools | Templates and open the template in the editor
 *
 * @author 0775768 <Hesam.Zarza>
 */
public class Flap {

    private boolean itsOk = true;

    public void calculate(String flapName) throws FlapException {

        double boom = 0.0005;
        double end;
        end = Math.random();

        if (boom >= end) {
            setItsOk(false);
            throw new FlapException(flapName + " kapot");

        }

//        if(boom != end ){
//            System.out.println("Geen probleem.");
//        }
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
