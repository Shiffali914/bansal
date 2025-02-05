package assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        University.setUniversityName("Oxford University");
        System.out.println(University.getUniversityName());

       Person[] person=new Person[4];

       person[0]=new Student("shiffali",30,101,"java",7.4);

       person[1]=new Professor("Robert Peterson",45,"P67890","Information Technology",20000.0);

       person[2]=new DepartmentHead("Dr.Sangetha Chanderkanta",50,"P98765","Computer Science",12000.00,"A-105");

       person[3]=new Student("Aman",35,102,"Phyton",6.7);
       for(int i=0; i< person.length; i++) {

           if (person[i].getType().equals(Student.class)) {
               System.out.println();
               person[i].displayinfo();
               University.incrementStudentCount();
           }
           else if (person[i].getType().equals(Professor.class)) {
               System.out.println();
               person[i].displayinfo();
               University.incrementProfessorCount();
           }
           else {
               System.out.println();
               person[i].displayinfo();
               University.incrementdepartmenthead();

           }
       }
        System.out.println();
        System.out.println("------University Statistics-------");
        System.out.println("Total Students " +University.getTotalStudents());
        int total=University.getTotalprofessor()+University.getTotaldepartmentheads();
        System.out.println("Total professor" +total);


    }
}
