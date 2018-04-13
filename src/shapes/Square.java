package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    void setWidth(double input) {
        setLength(input);
        setWidth(input);
    }

    @Override
    void setLength(double input) {
        setLength(input);
        setWidth(input);
    }

    @Override
    public double getPerimeter() {
        return getWidth()*4;
    }

    @Override
    public double getArea() {
        return getWidth()*getLength();
    }
//    protected double side;
//
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//
//    }
//
//
//    public double getArea() {
//        return this.side * this.side;
//    }
//
//    public double getPerimeter() {
//        return this.side*4;
//    }

}
