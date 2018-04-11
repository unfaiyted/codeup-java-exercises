import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        int inputInt;
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter an integer.: ");
        inputInt = sc.nextInt();

        System.out.print("user: " + inputInt + "\n");

        //What happens if you input something that is not an integer?
        // an error in console. crash

        String inputString1; String inputString2; String inputString3;

        System.out.print("Enter a word (1): ");
        inputString1 = sc.next();

        System.out.print("Enter a word (2): ");
        inputString2 = sc.next();

        System.out.print("Enter a word (3): ");
        inputString3 = sc.next();



        System.out.print(inputString1 + "\n" +
                inputString2 + "\n" +
                inputString3 + "\n");

        /*
        *
        * Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.

            What happens if you enter less than 3 words?
            What happens if you enter more than 3 words?
            Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method, then display that sentence back to the user.

            do you capture all of the words?
            Rewrite the above example using the .nextLine method.

            Calculate the perimeter and area of Codeup's classrooms

            Prompt the user to enter values of length and width of the classroom.

            Use the .nextLine method to get user input and cast the resulting string to a numeric type.

            Assume that the rooms are perfect rectangles.
            Assume that the user will enter valid numeric data for length and width.
            Display the area and perimeter of that classroom.
        *
        *
        *
        *
        * */



    }
}
