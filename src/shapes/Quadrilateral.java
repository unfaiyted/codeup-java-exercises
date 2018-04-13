package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;

    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    abstract void setWidth(double input);
    abstract void setLength(double input);


    //    protected properties for length and width
//    a constructor that accepts two numbers for the length and width
//      and sets those properties
//    methods for getting the length and width
//    abstract methods for setting the length and width




}
