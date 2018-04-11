import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {

    int randomNumber = roll(100);
    boolean matched = false;
    int guess;

    int i = 1;

        Scanner sc = new Scanner(System.in);

    System.out.println("Guess my number or by my SLAVE! ");

    do {
        System.out.print("Guess > ");
        guess = sc.nextInt();

        if (guess < randomNumber) {
            System.out.println("TOO LOW, SO SLOW ");

        } else if (guess > randomNumber) {
            System.out.println("TOO HIGH! GOODBYE!");
        } else {
            System.out.println("You're a mess, but good guess!");
            System.out.println("It took you tries " + i + ", wow time flies.");
            matched = true;

        }

    i++;

        if (i == 20) { matched = true; System.out.println("You fail. Set sail."); }

    } while (!matched);




    }


    public static int roll(int max) {
        return (int)(Math.random() * max) + 1;
    }

}
