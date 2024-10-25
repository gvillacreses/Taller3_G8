public class Administrator extends User {

    public void createUserWithRole(String user, String password){
        User newUser = new User(user, password);
    }

    public void assignPermission(String user){
        //...
    }

    public void updateSoftware(){
        //...
    }

    public void assignResponsible(Course curso, Teacher responsible){
        //...
    }

    public void solveManagementIssue(){
        //..
    }
    public String sendNotification(){
        return "";
    };

}
