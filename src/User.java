import java.util.ArrayList;
public class User {
    protected String user;
    protected String password;
    protected String name;
    protected String lastName;
    private boolean loggedIn;
    protected ArrayList<Incident> incidents = new ArrayList<>();


    protected boolean logIn(String password){
        if (this.password.equals(password)){
            loggedIn = true;
            return true;
        } return false;
    }

    protected boolean logOut(){
        if (loggedIn){
            loggedIn = false;
            return true;
        } return false;
    }


    //Getters
    public String getUser(){return this.user;}
    public String getPassword(){return this.password;}
    public String getName(){return this.name;}
    public String getLastName(){return this.lastName;}
    public ArrayList<Incident> getIncidents(){
        return incidents;
    }


    //Setters
    public void setUser(String user){this.user = user;}
    public void setPassword(String password){this.password = password;}
    public void setName(String name){this.name = name;}
    public void setLastName(String lastName){this.lastName = lastName;}

}
