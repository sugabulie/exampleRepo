package univer;

public class Student {
    private String firstname;
    private String secondname;
    private String lastname;
    private int numberGroup;
    private int studenTicket;
    private int avgMarks;

    public Student(){
        this.firstname="noname";
        this.secondname="noname";
        this.lastname="noname";
        this.numberGroup=0;
        this.studenTicket=0;
        this.avgMarks=0;

    }
    public Student(String firstname,String secondname,String lastname, int numberGroup,int studenTicket,int avgMarks){
        this.firstname=firstname;
        this.secondname=secondname;
        this.lastname=lastname;
        this.numberGroup=numberGroup;
        this.studenTicket=studenTicket;
        this.avgMarks=avgMarks;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public int getStudenTicket() {
        return studenTicket;
    }

    public void setStudenTicket(int studenTicket) {
        this.studenTicket = studenTicket;
    }

    public int getAvgMarks() {
        return avgMarks;
    }

    public void setAvgMarks(int avgMarks) {
        this.avgMarks = avgMarks;
    }
    @Override
    public String toString() {
        return String.format("ФИО: %s %s %s\nНомер группы: %s\nНомер студака: %s\nСредние оценка: %s",firstname,secondname,lastname,numberGroup,studenTicket,avgMarks);
    }
}
