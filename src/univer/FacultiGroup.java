package univer;

import java.util.ArrayList;

public class FacultiGroup implements Trainees {
        private String facultyName;
        private ArrayList<Student> listOfStudent;

        public FacultiGroup(){

            this.facultyName="noname";
            this.listOfStudent=new ArrayList<>();
        }


        public String getFacultyName() {
            return facultyName;
        }

        public void setFacultyName(String facultyName) {
            this.facultyName = facultyName;
        }

        public ArrayList<Student> getListOfStudent() {
            return listOfStudent;
        }

        public void setListOfStudent(ArrayList<Student> listOfStudent) {
            this.listOfStudent = listOfStudent;
        }

        public FacultiGroup(int numberGroup, String facultyName, int course, ArrayList<Student> listOfStudent){
            this.facultyName=facultyName;
            this.listOfStudent=new ArrayList<Student>();

        }

        @Override
        public String toString() {
            return String.format("факультет %s\n  список студентов %s\n",facultyName,listOfStudent);
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
