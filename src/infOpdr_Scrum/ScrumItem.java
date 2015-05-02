
package infOpdr_Scrum;

/**
 *
 * @author 0775768 <Hesam.Zarza>
 */
import java.util.Calendar;
import java.util.Date;

public class ScrumItem {
    protected int id;
    private String createDate;
    private String creator;

    /**
     *
     * @return createDate
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     *
     * @param createDate
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /**
     *
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     *
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * method om tijd mee te calculeren
     * @return
     */
    public int calculateTime(){

        int total = 0;
        Calendar _cal = Calendar.getInstance();

        Date _currentDate = _cal.getTime();


        //total = Date. - getCreateDate();

        return total;


    }
    
}

