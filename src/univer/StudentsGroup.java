package univer;

import java.util.ArrayList;

public class StudentsGroup {
    private int numberGroup;
    private String facultyName;
    private int course;
    private ArrayList<Student> listOfStudent;

    public StudentsGroup(){
        this.numberGroup=0;
        this.facultyName="noname";
        this.course=0;
        this.listOfStudent=new ArrayList<>();
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public ArrayList<Student> getListOfStudent() {
        return listOfStudent;
    }

    public void setListOfStudent(ArrayList<Student> listOfStudent) {
        this.listOfStudent = listOfStudent;
    }

    public StudentsGroup(int numberGroup, String facultyName, int course, ArrayList<Student> listOfStudent){
        this.numberGroup=numberGroup;
        this.facultyName=facultyName;
        this.course=course;
        this.listOfStudent=new ArrayList<Student>();

    }

    @Override
    public String toString() {
        return String.format("номер группы" + numberGroup +"факультет" + facultyName +"курс:" + course +"список студентов:" + listOfStudent);
    }
}
