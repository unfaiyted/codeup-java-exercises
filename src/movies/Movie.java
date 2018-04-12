package movies;

public class Movie {

    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
       return this.name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
       return this.category;
    }

//    // Return all movies in specific category
//    public static Movie[] listInCategory(Movie[] movies, String category) {
//
//        Movie[] catMovies
//
//        for(Movie movie: movies) {
//
//        }
//
//
//        return movies;
//    }

    public static void displayMovies(Movie[] movies, String category) {
        for(Movie movie: movies) {
            if(movie.getCategory().equalsIgnoreCase(category) || category.equalsIgnoreCase("all")) {
                System.out.println(movie.getName() + " - " + movie.getCategory());
            }
        }

    }

}
