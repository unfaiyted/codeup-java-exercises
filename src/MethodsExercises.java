public class MethodsExercises {

    public static void main(String[] args) {

        System.out.println("Add: 3 + 4 = " + addition(3,4));

        System.out.println("Subtract: 3 - 4 = " + subtraction(3,4));

        System.out.println("Multiply: 3 * 4 = " + multiplication(3,4));

        System.out.println("Divide: 3 / 4 = " + division(3,4));

        System.out.println("Modulus: 5 % 4 = " + modulus(5,4));

        //System.out.println("Divide: 3 / 0 = " + division(3,0);

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

    ˚

    public static float division(int x, int y) {
        return (float) x / y;
    }

    public static int modulus(int x, int y) {
        return  x % y;
    }
}
