package shapes;

public class Square extends Rectangle {
    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;

    }


    public double getArea() {
        return this.side * this.side;
    }

    public double getPerimeter() {
        return this.side*4;
    }

}
