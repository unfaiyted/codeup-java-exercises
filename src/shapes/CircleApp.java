package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input input = new Input();
        boolean keepAdding = true;

        do {

            double radius = input.getDouble("Enter the radius of the circle: ");

            Circle userCircle = new Circle(radius);

            userCircle.displayData();

            keepAdding =  input.yesNo("Do you want to keep adding circles? ");

        } while(keepAdding);


        // Total circles
        System.out.println("Total Circles: " + Circle.total());







    }

}