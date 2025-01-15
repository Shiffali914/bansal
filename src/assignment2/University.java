package assignment2;

public class University {

    static String UniversityName;
    static int totalStudents=0;
    static int totalprofessor=0;
    static int totaldepartmentheads=0;

    public static void setUniversityName(String universityName) {
        UniversityName = universityName;
    }

    public static String getUniversityName() {
        return UniversityName;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public static int getTotalprofessor() {
        return totalprofessor;
    }

    public static int getTotaldepartmentheads() {
        return totaldepartmentheads;
    }

    public static void incrementStudentCount(){
        totalStudents++;
    }
    public static void incrementProfessorCount(){
        totalprofessor++;
    }
    public static void incrementdepartmenthead()
    {
        totaldepartmentheads++;
    }
}
