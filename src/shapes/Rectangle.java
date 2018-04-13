package shapes;

public class Rectangle extends Quadrilateral {
//        protected double length;
//        protected double width;
//
//    public Rectangle(double length, double width) {
//            this.length = length;
//            this.width = width;
//
//    }
//

    public Rectangle(double length, double width) {
        super(length, width);
    }

    void setWidth(double input) {
        setWidth(input);
    }

    void setLength(double input) {
        setLength(input);

    }



    public double getArea() {
                return getLength() * getWidth();
    }

    public double getPerimeter() {
        return (getLength()*2) + (getWidth()*2);
    }

}
