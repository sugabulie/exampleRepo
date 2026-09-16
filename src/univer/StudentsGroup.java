package univer;

import java.util.ArrayList;

public class StudentsGroup implements Trainees {
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
        return String.format("номер группы %s\n факультет %s\n курс %s\n список студентов %s\n",numberGroup,facultyName,course,listOfStudent);
    }

    @Override
    public void deleteStudent(Student a) {
        this.listOfStudent.remove(a);
    }

    @Override
    public void addStudent(Student a) {
    this.listOfStudent.add(a);
    }

    @Override
    public void increaseAVGMark(Student a) {
        for(Student cache:this.listOfStudent){
            if(cache==a){
                cache.setAvgMarks(cache.getAvgMarks()+1);
                return;
            }
        }
    }
}
