/**
 *
 * @author 0775768 <Hesam.Zarza>
 */
package infOpdr_Scrum;

import java.time.LocalDate;
import java.time.Period;

public class Runner {

    public static void main(String arg[]) {

        /**
         * Nieuw Scrum item
         */
        ScrumItem taak1 = new ScrumItem();
        taak1.setCreateDate("23-02-2015");
        taak1.setCreator("Hesam Zarza");

        Task taak = new Task(1, "TEST", 2);

        Sprint nieuweSprint = new Sprint("Dev test", Period.ZERO, LocalDate.now());

        UserStory taakVerhaal = new UserStory("Gewoon een verhaal.", 5);

    }
}
