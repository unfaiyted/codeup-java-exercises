package shapes;

public class ShapesTest {

    public static void main(String[] args) {

//        Rectangle box1 = new Rectangle(5,4);
//
//        System.out.println("getArea: " + box1.getArea());
//        System.out.println("getPerimeter: " + box1.getPerimeter());
//
//
//        Rectangle box2 = new Square(5);
//
//        System.out.println("BOX2 getArea: " + box2.getArea());
//        System.out.println("BOX2 getPerimeter: " + box2.getPerimeter());

        Measurable myShape;

        myShape = new Square(5);

        System.out.println("getArea: " + myShape.getArea());
       System.out.println("getPerimeter: " + myShape.getPerimeter());

        myShape = new Rectangle(5,10);

        System.out.println("getArea: " + myShape.getArea());
        System.out.println("getPerimeter: " + myShape.getPerimeter());

    }
}
