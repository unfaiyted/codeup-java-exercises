package movies;
import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {


        Input input = new Input();
        boolean keepOpen = true;

        // Setup movies list
        MoviesArray.findAll();

        do {

            System.out.print("What would you like to do? \n" +
                    "0 - exit \n" +
                    "1 - view all movies \n" +
                    "2 - view movies in the animated category \n" +
                    "3 - view movies in the drama category \n" +
                    "4 - view movies in the horror category \n" +
                    "5 - view movies in the scifi category \n\n");

            int userInt = input.getInt(0, 5);


            switch (userInt) {

                case 0:
                    keepOpen = false;
                    break;
                case 1:
                    Movie.displayMovies(MoviesArray.findAll(), "all");
                    break;
                case 2:
                    Movie.displayMovies(MoviesArray.findAll(), "animated");
                    break;
                case 3:
                    Movie.displayMovies(MoviesArray.findAll(), "drama");
                    break;
                case 4:
                    Movie.displayMovies(MoviesArray.findAll(), "horror");
                    break;
                case 5:
                    Movie.displayMovies(MoviesArray.findAll(), "scifi");
                    break;
            }


            input.pressEnter("Press Enter.");



        } while(keepOpen);




    }
}