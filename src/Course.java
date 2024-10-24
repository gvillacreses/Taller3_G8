public class Course {
    private String idCourse;
    private String courseName;
    private boolean availableStatus;


    //Getters
    public String getIdCourse(){return this.idCourse;}
    public String getCourseName(){return this.courseName;}
    public boolean getAvailableStatus(){return this.availableStatus;}

    //Setters
    public void setIdCourse(String idCourse){this.idCourse = idCourse;}
    public void setCourseName(String courseName){this.courseName = courseName;}
    public void setAvailableStatus(boolean availableStatus){this.availableStatus = availableStatus;}
}
