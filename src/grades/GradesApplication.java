package grades;

import java.util.HashMap;
import util.Input;

public class GradesApplication {

    public static void main(String[] args) {

        boolean appContinue = true;
        Input input = new Input();

        HashMap<String, Student> students = new HashMap<>();

        students.put("Xikage", new Student("TimBo"));
        students.put("Xolaeth", new Student("Hesstopher"));
        students.put("Akira", new Student("Bosnanai"));
        students.put("Faiyt", new Student("Dan"));

        students.get("Xikage").addGrade(55);
        students.get("Xikage").addGrade(10);
        students.get("Xikage").addGrade(100);

        students.get("Xolaeth").addGrade(55);
        students.get("Xolaeth").addGrade(10);
        students.get("Xolaeth").addGrade(100);

        students.get("Akira").addGrade(55);
        students.get("Akira").addGrade(10);
        students.get("Akira").addGrade(95);

        students.get("Faiyt").addGrade(100);
        students.get("Faiyt").addGrade(99);
        students.get("Faiyt").addGrade(100);
        students.get("Faiyt").addGrade(100);


//        Student tim = new Student("Timmo");
//
//        tim.addGrade(100);
//        tim.addGrade(100);
//
//       System.out.println("Avg: " + tim.getGradeAverage());
//
//        tim.addGrade(50);
//
//        System.out.println("Avg: " + tim.getGradeAverage());

        System.out.print("Welcome!\n" +
                "\n" +
                "Here are the github usernames of our students:\n" +
                "\n");
        students.forEach((k, v) -> System.out.print(" |" + k + "| "));


        String userInput;

        do {

            System.out.print("\n" +
                    "What student would you like to see more information on?\n");

            System.out.print("> ");
            userInput = input.getString();


            if (students.containsKey(userInput)) {
                System.out.print("Name: " + students.get(userInput).getName() + " - Gihub Username: " + userInput + "\n" +
                        "Current Average: " + students.get(userInput).getGradeAverage());
            } else {
                System.out.print("\n" +
                        "Sorry, no student found with the gihub username of \"" + userInput + "\" \n");
                appContinue = (input.yesNo("Would you like to see another student? (y/no) \n> "));
            }


//        switch (userInput) {
//
//            case "exit":
//                appContinue = false;
//                break;
//
//            }
        }

        while (appContinue);


    }




}



