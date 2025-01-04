package assignment;

import java.util.Scanner;

import static java.lang.System.exit;

public class StudentAttendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[5];
        boolean found = false;
        System.out.println("enter the name of student in a class");
        for (int i = 0; i < name.length; i++) {
            name[i] = sc.nextLine();
        }
        System.out.println("enter the name of student to check the attendance");
        String student = sc.nextLine();
        for (int i = 0; i < name.length; i++) {
            if (student.equals(name[i])) {
                System.out.println(student + "is present in class");
                found = true;
                break;

            }

        }
        if (!found) {
            System.out.println(student + "is absent in class");
            exit(0);

        }
    }

}