package segundoGOF;

/**
 * Created by ton on 9/23/14.
 */
public interface Observer {

    //method to update the observer, used by subject
    public void update();

    //attach with subject to observe
    public void setSubject(Subject sub);
}
