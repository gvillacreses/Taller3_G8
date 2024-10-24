public class User {
    protected String user;
    protected String password;
    protected String name;
    protected String lastName;

    protected boolean logIn(){
        return true;
    }

    protected boolean logOut(){
        return true;
    }

    public String getUser(){return this.user;}
    public String getPassword(){return this.password;}
    public String getName(){return this.name;}
    public String getLastName(){return this.lastName;}

    public void setUser(String user){this.user = user;}
    public void setPassword(String password){this.password = password;}
    public void setName(String name){this.name = name;}
    public void setLastName(String lastName){this.lastName = lastName;}

}
