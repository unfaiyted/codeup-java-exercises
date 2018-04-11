import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        System.out.println("Add: 3 + 4 = " + addition(3,4));

        System.out.println("Subtract: 3 - 4 = " + subtraction(3,4));

        System.out.println("Multiply: 3 * 4 = " + multiplication(3,4));

        System.out.println("Multiply (hard): 3 * 4 = " + multiplyHardMode(3,4));

        System.out.println("Divide: 3 / 4 = " + division(3,4));

        System.out.println("Modulus: 5 % 4 = " + modulus(5,4));

        //System.out.println("Divide: 3 / 0 = " + division(3,0);



        int userInput = getInteger(1, 16);

        System.out.println("Valid input: " + userInput);

        getFactorial(userInput);

    }

    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }
    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int multiplyHardMode(int x, int y) {
        int multiply = x;
        for(int i = 1; i < y; i++) {
            multiply += x;
        }
        return multiply;
    }

    public static float division(int x, int y) {
        return (float) x / y;
    }

    public static int modulus(int x, int y) {
        return  x % y;
    }


    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int input;

        do {

            System.out.print("Enter a number between " + min + " and " + max);
            input = sc.nextInt();

        } while(input < min || input > max);

        return input;
    }


    public static long getFactorial(int number) {

        String multiplyString = "! = 1 ";
        int total = 1;

        System.out.println("1"+ multiplyString + " = " + total);

        for(int i = 2; i <= number; i++) {

            total = total*i;
            multiplyString += "x "+ i + " ";
            System.out.println(i + multiplyString + " = " + total);

        }

        return (long) total;
    }


}
