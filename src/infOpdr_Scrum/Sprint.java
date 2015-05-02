/**
 *
 * @author 0775768 <Hesam.Zarza>
 */
package infOpdr_Scrum;

import java.time.LocalDate;
import java.time.Period;
import java.util.LinkedList;

public class Sprint extends ScrumItem {

    public Sprint(String sprintVision, Period startDuration, LocalDate startDate) {
        this.sprintVision = sprintVision;
        this.startDuration = startDuration;
        this.startDate = startDate;
    }
    LinkedList<UserStory> linkedList = new LinkedList<UserStory>();
    String sprintVision;
    LocalDate startDate;
    Period startDuration;

    public void addAllUserStories(LinkedList<UserStory> linkedList) {

    }

    public void addUserStories(UserStory story) {
        
        linkedList.add(story);
    }

    public String toString() {
        return sprintVision;
    }

    public boolean equals(Object vergelijker) {
        if (vergelijker instanceof Sprint && ((Sprint) vergelijker).startDate == this.startDate) {
            return true;
        } else {
            return false;
        }
    }
}
