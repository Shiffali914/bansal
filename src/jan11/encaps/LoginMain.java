package jan11.encaps;

public class LoginMain {
    public static void main(String[] args) {
        LoginApp login=new LoginApp("Pragra","Pragra123");
        login.loginuser("pragra","pragra123");

        System.out.println();

        //some hacker
       // login.password="Mypassword";
        login.setPassword("Mypassword");
        login.loginuser("pragra","Mypassword");
    }
}
