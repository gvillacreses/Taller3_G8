
import java.util.ArrayList;
public class Teacher extends AcademicStaff {

    private ArrayList<Course> ownedCourses = new ArrayList<>();
    

    public void loadSummativeActivity(Course course, SummativeActivity SummativeActivity){
        //...
    }

    public void gradeSummativeActivity(Course course, Student student, SummativeActivity summativeActivity){
        //...
    }

    public void acceptRegistration(Course course, String userStudent){
        //...
    }

    public void createNewForum(Forum forum){
        //...
    }
    public ArrayList<Course> getOwnedCourses(){
        return ownedCourses;
    }
    
}
