package util;

import java.util.Scanner;

public class Input {
    private Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
    }


    String getString() {
        return this.sc.nextLine();
    }

    boolean yesNo() {
        String input = this.sc.nextLine();
        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
    }

    int getInt(int min, int max) {
        System.out.print("Please input a number between " + min + " and "+ max + ": ");

        int userInt = this.getInt();

        return (userInt > max || userInt < min) ? getInt(min, max) : userInt;

    }

    //Validate int input
    int getInt() {
        try {
            String inputInt  = this.sc.next();
            return Integer.valueOf(inputInt);
        } catch(NumberFormatException e) {
            System.out.println("Try again. Fail. ");
            return getInt();
        }
    }


    double getDouble(double min, double max) {
        System.out.print("Please input a decimal number between " + min + " and "+ max + ": ");


    }

    double getDouble() {
        try {
            String input = this.sc.next();
            return Double.valueOf(input);
        } catch(NumberFormatException e) {
            System.out.println("Try again. Fail. ");
            return getDouble();
        }

    }


}
