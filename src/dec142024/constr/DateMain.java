package dec142024.constr;

public class DateMain {
        public static void main(String[] args) {
            DateDemo demo = new DateDemo();
            System.out.println("Date:"+demo.day+ "/"+demo.month+ "/"+demo.year);
            DateDemo demo1= new DateDemo(01,01,2025);
            System.out.println("New Year date :"+demo1.day+ "/"+demo1.month+ "/"+demo1.year);
        }
}
