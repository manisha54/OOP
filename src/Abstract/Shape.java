package Abstract;

public abstract class Shape {

    protected abstract  float area();

    // hide the implementation
    public String getShapeName() {
        return  "Shape is the parent class";

    }

}
