package jan21.anonymous;

public class StudentMain {
    public static void main(String[] args) {


        //this is not the object of student class
        // there is a class present which gives the implementation of the Student Class but there is no name present
        // when we used one time implementation then that time we use anonymous Class


        Student student=new Student() {
            @Override
            public void read() {
                System.out.println("Math read");
            }

            @Override
            public void sleep() {
                System.out.println("Math sleep");
            }

            @Override
            public void run() {
                System.out.println("Math run");
            }
        };
        student.run();
        student.read();
        student.sleep();

        //we can use with interfaces also

        //this can be converted into lambda when we learn Java 8 feature

        Mobile mobile=new Mobile() {
            @Override
            public void surfInternet() {
                System.out.println("surfing");
            }
        };
        mobile.surfInternet();
    }
}
