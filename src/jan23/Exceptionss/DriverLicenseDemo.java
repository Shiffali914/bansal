package jan23.Exceptionss;

public class DriverLicenseDemo {

    public void eligiblity(int age){
        try{
        if(age<18){
            //System.out.println("You are not eligible");
            throw new InvalidAgeException("INvalid age");
        }
        else{
            System.out.println("You are eligible");
        }
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}
