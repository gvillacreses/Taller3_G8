import java.time.*;
import java.util.*;

public class Incident {
    protected int idIncident;
    protected LocalDateTime reportedDate;
    protected String status;
    protected String title;
    protected String description;
    protected List<String> updatesLog = new ArrayList<>();
    protected LocalDateTime closedDate;
    protected String type;
    private User monitor;
    private AcademicStaff beneficiary;

    //Getters
    public int getIdIncident(){return this.idIncident;}
    public LocalDateTime getReportedDate(){return this.reportedDate;}
    public String getStatus(){return this.status;}
    public String getTitle(){return this.title;}
    public String getDescription(){return this.description;}
    public List<String> getUpdatesLog(){return this.updatesLog;}
    public LocalDateTime getClosedDate(){return this.closedDate;}
    public String getType(){return this.type;}
    public User getMonitor(){return this.monitor;}
    public AcademicStaff getBeneficiary(){return this.beneficiary;}

    //Setters
    public void setIdIncident(int idIncident){this.idIncident = idIncident;}
    public void setReportedDate(LocalDateTime reportedDate){this.reportedDate = reportedDate;}
    public void setStatus(String status){this.status = status;}
    public void setTitle(String title){this.title = title;}
    public void setDescription(String description){this.description = description;}
    public void setClosedDate(LocalDateTime closedDate){this.closedDate = closedDate;}
    public void setType(String type){this.type = type;}
    public void setMonitor(User u){this.monitor=u;}
    public void setBeneficiary(AcademicStaff as){this.beneficiary=as;}

    
}
