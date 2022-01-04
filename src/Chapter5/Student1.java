package Chapter5;

public class Student1 {
    private String fname;
    private String lname;
    private int age;



    //Constructor
    public Student1(String fname, String lname, int age){
        this.fname  = fname;
        this.lname = lname;
        this.age = age;

//  setter
//  public void setFname(String fname){
        this.fname = fname;
    }
    public void setLname(String lname){
        this.lname = lname;
    }
    public void setAge(int age){
        this.age = age;
    }


    @Override()
    public String toString() {
        return "Student1{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }
}
