package util;



public class InputTest {

    public static void main(String[] args) {

        // Test the Input class

        Input input = new Input();


        // Binary Test
        // Integer Testing
        System.out.print("Input and a binary number: ");
        int userInt = input.getBinary();
        System.out.println("Int Input: " + userInt);
        userInt = input.getBinary("Prompt: Binary Number: ");
        System.out.println("Int Input: " + userInt);

        // Yes No Testing
        System.out.println("Input y/yes for true: ");
        boolean userYes = input.yesNo();
        System.out.println("Int Input: " + userYes);


        // Integer Testing
        System.out.println("Input and integer: ");
        userInt = input.getInt();
        System.out.println("Int Input: " + userInt);

        System.out.println("Input and integer between ");
        userInt = input.getInt(5, 10);
        System.out.println("Between Int Input: " + userInt);


        userInt = input.getInt("Input and integer (prompt)");
        System.out.println("(prompt) Int Input: " + userInt);

        userInt = input.getInt("Input an integer between (prompt)",5,10);
        System.out.println("(prompt) Between Int Input: " + userInt);


        // Double Testing
        System.out.println("Input and decimal numnber: ");
         double userDouble = input.getDouble();
        System.out.println("Between Int Input: " + userDouble);

        System.out.println("Input and integer between ");
        userDouble = input.getDouble(5.2, 11.45);
        System.out.println("Between Int Input: " + userDouble);

        userDouble = input.getDouble("Input and integer (prompt)");
        System.out.println("(prompt) Int Input: " + userDouble);

        userDouble = input.getDouble("Input an integer between (prompt)",5,10);
        System.out.println("(prompt) Between Int Input: " + userDouble);


    }

}
