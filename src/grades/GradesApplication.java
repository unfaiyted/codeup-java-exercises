package grades;

public class GradesApplication {

    public static void main(String[] args) {


        Student tim = new Student("Timmo");

        tim.addGrade(100);
        tim.addGrade(100);

       System.out.println("Avg: " + tim.getGradeAverage());

        tim.addGrade(50);

        System.out.println("Avg: " + tim.getGradeAverage());


    }


}



