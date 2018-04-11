import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        String message;

        Scanner sc = new Scanner(System.in);
        boolean match;
        System.out.println("Start talking to Bob! (type exit, to quit)");

            do {

                match = false;
                System.out.print("> ");
                message =  sc.nextLine();

                if(message.contains("!")) {
                    System.out.println("Whoa, chill out. ");
                    match = true;
                }

                if(message.contains("?")) {
                    System.out.println("Sure. ");
                    match = true;
                }

                if(message.replaceAll("\\s","").length() == 0) {
                    System.out.println("Fine. Be that way. ");
                    match = true;
                }

                if (!match) {
                    System.out.println("Whatever");
                }
            }
            while (!message.contains("exit"));


    }

}
