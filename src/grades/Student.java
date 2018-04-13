package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grade;

    public Student(String name) {
        this.name = name;
        this.grade = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grade.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        this.grade.size();

        int sum = 0;


        for(int item: grade) {
            sum += item;
        }

        return (double) (sum / this.grade.size());
    }

    public void displayAllGrades() {
        for(int item: grade) {
            System.out.print(item + " | ");
        }

    }

}
