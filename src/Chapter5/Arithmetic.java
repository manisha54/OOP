package Chapter5;

public class Arithmetic {
    private int addition;
    private int subtraction;
    private int division;
//    Constructor
    public Arithmetic(int addition, int subtraction, int division){
        this.addition = addition;
        this.subtraction =  subtraction;
        this.division = division;
    }
//    Setter
    public  void setAddition(int addition){
        this.addition = addition;
    }
    public  void setSubtraction(int subtraction){
        this.subtraction = subtraction;
    }
    public  void setDivision(int division){
        this.division = division;
    }



    @Override
    public String toString() {
        return "Arithmetic{" +
                "addition=" + addition +
                ", subtraction=" + subtraction +
                ", division=" + division +
                '}';
    }
}
