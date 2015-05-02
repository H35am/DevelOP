package infOpdr2_1;

import infOpdr2_1.ExceptionClasses.CrashException;
import infOpdr2_1.ExceptionClasses.EngineException;
import infOpdr2_1.ExceptionClasses.FlapException;
import infOpdr2_1.ExceptionClasses.PilotException;

/**
 * * Tools | Templates and open the template in the editor
 *
 * @author 0775768 <Hesam.Zarza>
 */
public class Airplane {

    private Flap linkerFlap = new Flap();
    private Flap rechterFlap = new Flap();

    private Engine engine1 = new Engine();
    private Engine engine2 = new Engine();
    private Engine engine3 = new Engine();
    private Engine engine4 = new Engine();

    private Pilot capiteinEen = new Pilot();
    private Pilot capiteinHelper = new Pilot();
    private Pilot capiteinTwee = new Pilot();

    public void flight(int vluchtNummer) throws CrashException {

        try {

            linkerFlap.calculate("Linker flap");
        } catch (FlapException flap) {

           // flap.vluchtNummerPrint(vluchtNummer);
            //System.out.println(flap.getMessage());

        }
        try {

            rechterFlap.calculate("Rechter flap");
        } catch (FlapException flap) {

           // flap.vluchtNummerPrint(vluchtNummer);
            //System.out.println(flap.getMessage());

        }
        try {
            engine1.calculate();
        } catch (EngineException engine) {
           // engine.vluchtNummerPrint(vluchtNummer);
            //System.out.println(engine.getMessage());
        }

        try {
            engine2.calculate();
        } catch (EngineException engine) {
            //engine.vluchtNummerPrint(vluchtNummer);
            //System.out.println(engine.getMessage());
        }

        try {
            engine3.calculate();
        } catch (EngineException engine) {
           // engine.vluchtNummerPrint(vluchtNummer);
           // System.out.println(engine.getMessage());
        }
        try {
            engine4.calculate();
        } catch (EngineException engine) {
           // engine.vluchtNummerPrint(vluchtNummer);
           // System.out.println(engine.getMessage());
        }

        try {
            capiteinEen.calculate();
        } catch (PilotException piloot) {
            //piloot.vluchtNummerPrint(vluchtNummer);
            //System.out.println(piloot.getMessage());

        }
        try {
            capiteinTwee.calculate();
        } catch (PilotException piloot) {
            //piloot.vluchtNummerPrint(vluchtNummer);
            //System.out.println(piloot.getMessage());

        }
        try {
            capiteinHelper.calculate();
        } catch (PilotException piloot) {
            //piloot.vluchtNummerPrint(vluchtNummer);
            //System.out.println(piloot.getMessage());

        }

        if (!linkerFlap.isItsOk() && !rechterFlap.isItsOk()) {

            throw new CrashException("Vliegtuis is gecrashed door uitval van velugels!");

        }

        if (!engine1.isItsOk() && !engine2.isItsOk()) {
            throw new CrashException("Vliegtuis is gecrashed door uitval motor1 en motor2!");
        }

        if (!engine3.isItsOk() && !engine4.isItsOk()) {
            throw new CrashException("Vliegtuis is gecrashed door uitval motor3 en motor4!");
        }

        if (!capiteinEen.isItsOk()
                && !capiteinTwee.isItsOk() && !capiteinHelper.isItsOk()) {

            throw new CrashException("Vliegtuis is gecrashed door uitval van alle piloten!");

        }
    }

}
