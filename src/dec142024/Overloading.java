package dec142024;

public class Overloading {

    public String info(String name)
    {
        String username =name;
        return username;
    }
    public String info(String name,String email){
        return name+" " +email;
    }
    public String info(String name,String email,String phoneno){
        return name+" "+email+" "+phoneno;
    }

}

/*
method overloading----> method with same but diff parameters
 */