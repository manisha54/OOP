package Chapter5;

public class Student {
    private String fname;
    private String lname;
    private int age;



//Constructor
    public Student(String fname, String lname, int age){
        this.fname  = fname;
        this.lname = lname;
        this.age = age;
    }
    @Override()
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }
}
