package util;

import java.util.Scanner;

public class Input {
    private Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
    }


    public String getString() {
        return this.sc.nextLine();
    }

    public String getString(String prompt) {
        System.out.print(prompt);
        return getString();
    }

    public boolean pressEnter() {
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
        return true;
    }
    public boolean pressEnter(String prompt) {
        System.out.print(prompt);
        return pressEnter();
    }

    public boolean yesNo() {
        String input = this.sc.next();
        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
    }

    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        return yesNo();
    }

    public int getInt(int min, int max) {
        System.out.print("Please input a number between " + min + " and "+ max + ": ");

        int userInt = this.getInt();

        return (userInt > max || userInt < min) ? getInt(min, max) : userInt;

    }

    public int getInt(String prompt, int min, int max) {
        System.out.print(prompt);
        return getInt(min, max);
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        return getInt();
    }

    //Validate int input
    public int getInt() {
        try {
            String inputInt  = this.sc.next();
            return Integer.valueOf(inputInt);
        } catch(NumberFormatException e) {
            System.out.println("Try again. Fail. ");
            return getInt();
        }
    }


    public double getDouble(double min, double max) {
        System.out.print("Please input a decimal number between " + min + " and "+ max + ": ");

        double userDouble = this.getDouble();

        return (userDouble > max || userDouble < min) ? getDouble(min, max) : userDouble;
    }

    public double getDouble(String prompt) {
        System.out.print(prompt);
        return getDouble();
    }

    public double getDouble(String prompt, double min, double max) {
        System.out.print(prompt);
        return getDouble(min, max);
    }


    public double getDouble() {
        try {
            String input = this.sc.next();
            return Double.valueOf(input);
        } catch(NumberFormatException e) {
            System.out.println("Try again. Fail. ");
            return getDouble();
        }

    }


}
