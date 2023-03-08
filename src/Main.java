import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an actor: ");
        String chosenActor = input.nextLine();

        Baconator bacon = new Baconator();
        ArrayList<SimpleMovie> movies = MovieDatabaseBuilder.getMovieDB("src/movie_data");
        ArrayList<SimpleMovie> connectedMovies = new ArrayList<SimpleMovie>();
        ArrayList<String> connectedActors = new ArrayList<String>();
        connectedActors.add("Kevin Bacon");
        int count = 0;

        while(!bacon.checkConnected(connectedActors, chosenActor, "Kevin Bacon")){
            connectedMovies = bacon.findConnectedMovies(connectedActors)
            count = bacon.getCount();
        }

//        for (SimpleMovie m: movies) {
//            ArrayList<String> actors = m.getActors();
//            for(int i = 0; i < actors.size(); i ++){
//                if(actors.contains("Kevin Bacon")){
//                    connectedMovies.add(m);
//                }
//            }
//        }

        System.out.println("Number of movies: " + movies.size());


    }


}