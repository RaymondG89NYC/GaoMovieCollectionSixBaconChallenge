import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<SimpleMovie> movies = MovieDatabaseBuilder.getMovieDB("src/movie_data");
        ArrayList<SimpleMovie> connectedMovies = new ArrayList<SimpleMovie>();
        ArrayList<String> connectedActors = new ArrayList<String>();
        for (SimpleMovie m: movies) {
            ArrayList<String> actors = m.getActors();
            for(int i = 0; i < actors.size(); i ++){
                if(actors.contains("Kevin Bacon")){
                    connectedMovies.add(m);
                }
            }
        }
        System.out.println("Number of movies: " + movies.size());


    }


}