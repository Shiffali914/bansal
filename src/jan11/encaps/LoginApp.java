package jan11.encaps;

public class LoginApp {
     private String UserName;
    private String password;


    public LoginApp(String userName, String password) {
        UserName = userName;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public String toString() {
        return "LoginApp{" +
                "UserName='" + UserName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void loginuser(String Username, String password){
        if(this.UserName.equalsIgnoreCase(Username) && this.password.equalsIgnoreCase(password)){
            System.out.println("user is authenicated");
            System.out.println("Welcome to my app  "+Username);
        }
        else{
            System.out.println("Invalid credentials");
            System.out.println("Please try again");
    }

}}
