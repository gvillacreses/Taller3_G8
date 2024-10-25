
import java.util.ArrayList;

public class Course {
    private String idCourse;
    private String courseName;
    private boolean availableStatus;
    private Teacher monitor;
    // se declararon las asociaciones

    private ArrayList<Forum> ownedForums = new ArrayList<>();
    private ArrayList<Student> registeredStudents = new ArrayList<>();
    private ArrayList<Student> waitingStudents = new ArrayList<>();
    private ArrayList<SummativeActivity> summativeActivities = new ArrayList<>();



    //Getters
    public String getIdCourse(){return this.idCourse;}
    public String getCourseName(){return this.courseName;}
    public boolean getAvailableStatus(){return this.availableStatus;}

    //Setters
    public void setIdCourse(String idCourse){this.idCourse = idCourse;}
    public void setCourseName(String courseName){this.courseName = courseName;}
    public void setAvailableStatus(boolean availableStatus){this.availableStatus = availableStatus;}

    public ArrayList<Forum> getOwnedForums(){
        return ownedForums;
    }
    public ArrayList<Student> getRegisteredStudents(){
        return registeredStudents;
    }

    public ArrayList<Student> getWaitingStudents(){
        return waitingStudents;
    }
    public Teacher getMonitor(){
        return monitor;
    }
    public ArrayList<SummativeActivity> getSummativeActivities(){
        return summativeActivities;
    }
    
}
