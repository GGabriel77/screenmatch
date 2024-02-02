import br.com.screenmatch.model.Movie;
import br.com.screenmatch.model.Serie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie =  new Movie();
        myMovie.name = "The Godfather";
        myMovie.releaseYear = 1970;
        myMovie.movieTime = 180;

        myMovie.showMovieDescription();
        myMovie.ratingValiation(9);
        myMovie.ratingValiation(7);
        myMovie.ratingValiation((10));

        //System.out.println(myMovie.plusRating);
        System.out.println("Total de avaliações: " + myMovie.getAllReviews());
        System.out.println(myMovie.getAvarege());

        Serie theOffice = new Serie();
        theOffice.setTemporadas(9);
        theOffice.setEpisodiosPorTemporada(16);
        theOffice.setMinutosPorEpisodio(23);
        theOffice.setName("The Office");''



    }
}
