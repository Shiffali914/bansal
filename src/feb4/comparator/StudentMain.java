package feb4.comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(30, "Rajinder", "A"));
        list.add(new Student(31, "Gagan", "A+"));
        list.add(new Student(24, "Rakesh", "D"));
        list.add(new Student(22, "Neeraj", "C"));
        list.add(new Student(48, "Sunil", "B"));



        Collections.sort(list,new GradeComparator());
        for(Student s1:list){
            System.out.println(s1.getGrade());
        }

        /*Comparator<Student>comparator=new Comparator<Student>() { // this is used when we not implement from class from
                                                                 // comparator interface and we use anonymous interface concept.
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };*/

       /* Collections.sort(list,comparator);
        for(Student s:list){
            System.out.println(s.getName()+":"+s.getAge());*/
    }
       /* Collections.sort(list,new NameComparator());
        for(Student s:list){
            System.out.println(s.getName()+":"+s.getAge());
        }
        System.out.println("----------");
        Collections.sort(list,new AgeCompartor());
        for(Student s1:list){
            System.out.println(s1.getName()+":"+s1.getAge());
        }*/



}



