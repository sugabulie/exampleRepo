public class Person {
    private String firstname;
    private String secondname;
    private String lastname;
    private int age;

    public Person(){
        this.firstname ="noname";
        this.secondname="noname";
        this.lastname="noname";
        this.age=0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String firstname, String secondname, String lastname, int age){
        this.firstname=firstname;
        this.secondname=secondname;
        this.lastname=lastname;
        this.age=age;

    }
}
