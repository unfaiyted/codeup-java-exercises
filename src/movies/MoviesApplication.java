package movies;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    public static void main(String[] args) {


        Movie[] movies = MoviesArray.findAll();
        Input input = new Input();
        boolean keepOpen = true;

        do {

            System.out.print("What would you like to do? \n" +
                    "0 - exit \n" +
                    "1 - view all movies \n" +
                    "2 - view movies in the animated category \n" +
                    "3 - view movies in the drama category \n" +
                    "4 - view movies in the horror category \n" +
                    "5 - view movies in the scifi category \n" +
                    "6 - add movie\n");

            int userInt = input.getInt(0, 6);


            switch (userInt) {

                case 0:
                    keepOpen = false;
                    break;
                case 1:
                    Movie.displayMovies(movies, "all");
                    break;
                case 2:
                    Movie.displayMovies(movies, "animated");
                    break;
                case 3:
                    Movie.displayMovies(movies, "drama");
                    break;
                case 4:
                    Movie.displayMovies(movies, "horror");
                    break;
                case 5:
                    Movie.displayMovies(movies, "scifi");
                    break;
                case 6:

                    String name = input.getString("Name of movie:");
                    userInt = input.getInt("Pick:\n1 = animated, 2 = drama,\n3 = horror, 4 = scifi\n",1, 4);

                    String category = "";

                    switch (userInt) {
                        case 1:
                            category = "animated";
                            break;
                        case 2:
                            category = "drama";
                            break;
                        case 3:
                            category = "horror";
                            break;
                        case 4:
                            category = "scifi";
                            break;
                    }

                   // Movie[] newMovies = new Movie[movies.length + 1];

                    movies = Arrays.copyOf(movies, movies.length+1);

//                    int i = 0;
//                    for(Movie movie : movies) {
//                        newMovies[i] = movie;
//                        i++;
//                    }
//                    i++;

                    movies[movies.length-1] = new Movie(name, category);

                   // Movie[] movies = newMovies;

                    System.out.println("Movie added.");

                    break;
            }


            input.pressEnter("Press Enter.");



        } while(keepOpen);




    }
}