package shapes;

public class Square extends Quadrilateral {

    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    double setWidth(double input) {
        return 0;
    }

    @Override
    double setLength(double input) {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
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
