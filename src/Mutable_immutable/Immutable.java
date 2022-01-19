package Mutable_immutable;

//model
public final class Immutable {
    private final int first;
    private final  int second;

    //constructor
    public  Immutable(int first, int second){
        this.first = first;
        this.second = second;

    }

    //Getter
    public  int getFirst(){
        return this.first;
    }
    public  int getSecond(){
        return this.second;
    }

    //behaviour
    public  int add(){
        return this.first + this.second;
    }
}
