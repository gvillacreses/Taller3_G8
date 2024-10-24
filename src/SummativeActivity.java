import java.time.*;;

public class SummativeActivity {
    protected String title;
    protected LocalDateTime deliveryDate;
    protected float maximumScore;
    protected String content;
    protected float grade;
    protected String idActivity;


    //Getters
    public String getTitle(){return this.title;}
    public LocalDateTime getDeliveryDate(){return this.deliveryDate;}
    public float getMaximumScore(){return this.maximumScore;}
    public String getContent(){return this.content;}
    public float getGrade(){return this.grade;}
    public String getIdActivity(){return this.idActivity;}

    //Setters
    public void setTitle(String title){this.title = title;}
    public void setDeliveryDate(LocalDateTime deliveryDate){this.deliveryDate = deliveryDate;}
    public void setMaximumScore(float maximumScore){this.maximumScore = maximumScore;}
    public void setContent(String content){this.content = content;}
    public void setGrade(float grade){this.grade = grade;}
    public void setIdActivity(String idActivity){this.idActivity = idActivity;}

}
