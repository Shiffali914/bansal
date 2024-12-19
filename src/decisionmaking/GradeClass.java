package decisionmaking;

public class GradeClass {
    public static void main(String[] args) {
        int marks=70;
        if (marks<=100 && marks>90)
        {
            System.out.println("excellent");
        }
        else if(marks<=90 && marks>80)
        {
            System.out.println("A+");
        }
        else if (marks<=80 && marks>70){
            System.out.println("A");
        }
        else if (marks<=70 && marks>60){
            System.out.println(" B+");
        }
        else if (marks<=60 && marks>50){
            System.out.println("B");
        }
        else if (marks<=50 && marks>40){
            System.out.println(" C");
        }
        else
            System.out.println("Fail");
        }
    }

