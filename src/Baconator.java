import java.util.*;

public class Baconator {
    private ArrayList<SimpleMovie> movies;
    private int count;

    public Baconator(){
        movies = MovieDatabaseBuilder.getMovieDB("src/movie_data");
        count = 0;
    }
    public ArrayList<SimpleMovie> findConnectedMovies(ArrayList<String> actors, String origin){
        ArrayList<SimpleMovie> connectedMovies = new ArrayList<SimpleMovie>();
        for (SimpleMovie m: movies) {
            for(int i = 0; i < actors.size(); i ++){
                if(actors.contains(origin)){
                    connectedMovies.add(m);
                }
            }
        }
        count++;
        return connectedMovies;
    }
    public ArrayList<String> findConnectedActors(ArrayList<SimpleMovie> connectedMovies,){
        ArrayList<String> connectedActors = new ArrayList<String>();
        for(SimpleMovie cm: connectedMovies){
            for(String a: cm.getActors()){
                connectedActors.add(a);
            }
        }
        return connectedActors;
    }
    public boolean checkConnected(ArrayList<String> connectedActors, String actor1, String actor2){
        boolean foundFirst = false;
        boolean foundSecond = false;
        for(String actor: connectedActors){
            if(actor.contains(actor1)){
                foundFirst = true;
            }
            if(actor.contains(actor2)){
                foundSecond = true;
            }
            if(foundFirst && foundSecond){
                return true;
            }
        }
        return foundFirst && foundSecond;
    }
    public int getCount(){
        return count;
    }
}
