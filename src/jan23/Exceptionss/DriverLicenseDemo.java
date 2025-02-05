package jan23.Exceptionss;

public class DriverLicenseDemo {

    public void eligiblity(int age){
        if(age<18){
            System.out.println("You are not eligible");
            throw new InvalidAgeException("INvalid age");
        }
        else{
            System.out.println("You are eligible");
        }
    }
}
