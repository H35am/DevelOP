/**
 *
 * @author 0775768 <Hesam.Zarza>
 */
package infOpdr_Scrum;

import java.time.LocalDate;

public class Task {

    public Task(int id, String description, int estimatedHours) {
        this.id = id;
        this.description = description;
        this.estimatedHours = estimatedHours;
    }

    public Task(int id, String description, int estimatedHours, int hoursSpent, LocalDate doneDate, boolean done) {
        this(id, description, estimatedHours);
        this.hoursSpent = hoursSpent;
        this.doneDate = doneDate;
        this.done = done;
    }

    private boolean done;
    private int estimatedHours;
    private LocalDate doneDate;
    private String description;
    private int id;
    private int hoursSpent;

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(int estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    public LocalDate getDoneDate() {
        return doneDate;
    }

    public void setDoneDate(LocalDate doneDate) {
        this.doneDate = doneDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHoursSpent() {
        return hoursSpent;
    }

    public void setHoursSpent(int hoursSpent) {
        this.hoursSpent = hoursSpent;
    }

    public void endTask(int hoursSpent, LocalDate doneDate, boolean done) {

    }

    @Override
    public String toString() {
        return description;
    }

    @Override
    //hoe werkt equals method
    public boolean equals(Object vergelijker) {
        if (vergelijker instanceof Task && ((Task) vergelijker).getId() == this.getId() && ((Task) vergelijker).getDescription() == this.getDescription()) {
            return true;
        } else {
            return false;
        }
    }

}
