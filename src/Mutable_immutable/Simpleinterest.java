package Mutable_immutable;

public class Simpleinterest {
    private  float principle;
    private float rate;
    private float time;

    //constructor
    public Simpleinterest(float principle, float rate, float time){
        this.principle = principle;
        this.rate = rate;
        this.time =time;
    }

    //getter
    public float getPrinciple(){
        return this.principle;
    }
    public float getRate(){
        return this.rate;
    }
    public float getTime(){
        return this.time;
    }

    //setter
    public void setPrinciple(float principle) {
        if (principle <= 0)
            throw new IllegalArgumentException("Principal can't be less than or equals toZERO");
        this.principle = principle;

    }
    public void setRate(float rate) {
        if (rate <= 0)
            throw new IllegalArgumentException("Principal can't be less than  toZERO");
        this.rate = rate;
    }
    public void setTime(float time) {
        if (time <= 0)
            throw new IllegalArgumentException("Principal can't be less than  toZERO");
        this.time = time;



    }

}
