import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String userInput;
        Scanner sc = new Scanner(System.in);

//int class = 2; /bad


        System.out.print("Enter Something: ");
        userInput = sc.nextLine();


        System.out.println("You entered: \"" + userInput + "\" cool. s");
        float favNumber = 3.14F;

        System.out.println(favNumber);

        String myString = "This is my string. Save me";

        System.out.println(myString);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

         x = 4;
        x+= 5;

        x = 3;
        int y = 4;
        y*=x;


        x = 10;
        y = 2;
        x /= y;
        y -= x;



    }
}
