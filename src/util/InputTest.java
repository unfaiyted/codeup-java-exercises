package util;



public class InputTest {

    public static void main(String[] args) {

        // Test the Input class

        Input input = new Input();

        System.out.print("Input and integer: ");
        int userInt = input.getInt();
        System.out.print("Int Input: " + userInt);

        System.out.print("Input and integer between ");
        userInt = input.getInt(5,10);
        System.out.print("Int Input: " + userInt);

    }

}
