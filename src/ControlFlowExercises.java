import java.math.BigInteger;
import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {



//        While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//
//        while (i <= 15) {
//
//            System.out.print(i + " ");
//
//            i++;
//
//        }
//
//        for(int i = 5; i<= 15; i++) {
//            System.out.print(i + " ");
//        }

//        Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536

//        double number = 2;
//
//        do {
//            int output = (int) number;
//            System.out.println(output);
//            number = number * number;
//
//        }
//        while (number < 1000000);


//
//        for(double number = 2; number < 1000000; number *= number) {
//
//            int output = (int) number;
//            System.out.println(output);
//
//        }
//

//
//        Fizzbuzz
//
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test.
//          Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.
//
//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three print “Fizz” instead of the number
//        For the multiples of five print “Buzz”.
//        For numbers which are multiples of both three and five print “FizzBuzz”.


//        for(int i = 1; i <= 100; i++) {
//
//            //System.out.print(i);
//
//            String returnVal = "";
//
//
//           returnVal =  (i%5 != 0 && i%3 != 0) ? String.valueOf(i) : returnVal;
//            returnVal = (i%3 == 0) ? "Fizz" : returnVal;
//            returnVal = (i%5 == 0) ?  returnVal + "Buzz" : returnVal;
//
//
//            System.out.println(returnVal);
//
//        }
//
//        Display a table of powers.
//
//                Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.

//        Scanner sc = new Scanner(System.in);
//        int userInt;
//
//
//        System.out.print("What number would you like to stop at: ");
//        userInt = sc.nextInt();
//
//
//        System.out.print("Here is your data table\n");
//
//        System.out.print("number | squared | cubed \n"+
//        "=========================\n");
//
//        for(int i = 1 ; i <= userInt; i++) {
//            System.out.print(String.valueOf(i) + "      | " + squared(i) + "      | " + cubed(i) + "\n" );
//        }


//        Convert given number grades into letter grades.
//
//                Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
//        Bonus
//
//        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).

        Scanner sc = new Scanner(System.in);
        int userInt;
        String userContinue;

        boolean continueOn = true;

        do {

            System.out.print("Enter grade: ");
            userInt = sc.nextInt();

            System.out.print( gradeToString(userInt) + "\n");

            System.out.print("Type Y or y to continue: ");
            userContinue = sc.next();

            if(!userContinue.contains("y") && !userContinue.contains("Y")) {
                continueOn = false;
            }

        } while (continueOn);

    }

    private static String gradeToString(int number) {

       String grade = (number >= 100) ? "A+": "F";

        if (number >= 50 && number < 100) {

            String numberString = Integer.toString(number);

            switch (Character.getNumericValue(numberString.charAt(0))) {
                case 5:
                    grade = "F";
                    break;
                case 6:
                    grade = "D";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 9:
                    grade = "A";
                    break;

            }


            switch (Character.getNumericValue(numberString.charAt(1))) {
                case 0: case 1: case 2: case 3:
                    grade += "-";
                    break;
                case 7: case 8: case 9:
                    grade += "+";
                    break;


            }



        }


        return grade;
    }

    public static int squared(int number) {
        return number*number;
    }

    public static int cubed(int number) {
        return number*number*number;

    }

}
