/**
 *
 * @author 0775768 <Hesam.Zarza>
 */
package infOpdr_Scrum;

import java.util.LinkedList;

public class UserStory {

    public UserStory(String story, int estimatedHours) {
        this.story = story;
        this.estimatedHours = estimatedHours;
    }

    private int estimatedHours;
    private boolean done;
    private int taskAmount;
    private int amountTasksDone;
    private LinkedList<Task> tasks;
    private int id;
    private int getAmountTasksUnDone;
    private String story;
    private int hourSpent;

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public int getTaskAmount() {
        return taskAmount;
    }

    public int getAmountTasksDone() {
        return amountTasksDone;
    }

    public LinkedList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(LinkedList<Task> tasks) {
        this.tasks = tasks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGetAmountTasksUnDone() {
        return getAmountTasksUnDone;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public int getHourSpent() {
        return hourSpent;
    }

    public void addTask(Task iets) {
        iets.setDescription("Gegevens over task");

    }

    public void addTasks() {

    }

}
