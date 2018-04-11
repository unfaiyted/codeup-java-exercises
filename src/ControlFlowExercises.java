import java.math.BigInteger;

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


        for(int i = 1; i <= 100; i++) {

            //System.out.print(i);

            String returnVal = "";


           returnVal =  (i%5 != 0 && i%3 != 0) ? String.valueOf(i) : returnVal;
            returnVal = (i%3 == 0) ? "Fizz" : returnVal;
            returnVal = (i%5 == 0) ?  returnVal + "Buzz" : returnVal;


            System.out.println(returnVal);

        }


    }


}
