import univer.FacultiGroup;
import univer.Student;
import univer.StudentsGroup;
import univer.Trainees;

public class Main {
    public static void main(String[] args) {
        Student Pypa = new Student("-","-","-",1,123,3);
        Trainees a = new StudentsGroup();
        a.addStudent(Pypa);
        System.out.println(a);
        Student Lypa = new Student("j","k","o",2,322,4);
        Trainees b = new FacultiGroup();
        b.addStudent(Lypa);
        System.out.println(b);
    }
}
