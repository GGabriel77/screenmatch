import br.com.screenmatch.model.Movie;
import br.com.screenmatch.model.Serie;
import br.com.screenmatch.model.Titulo;

public class Main {
    public static void main(String[] args) {
        Movie myMovie =  new Movie();
        myMovie.setName("The Godfather");
        myMovie.setReleaseYear(1970);
        myMovie.setMinutesDurationTime(180);
        System.out.println("Duração do filme: " + myMovie.getMinutesDurationTime());

        myMovie.showMovieDescription();
        myMovie.ratingValiation(9);
        myMovie.ratingValiation(7);
        myMovie.ratingValiation((10));

        //System.out.println(myMovie.plusRating);
        //System.out.println("Total de avaliações: " + myMovie.getAllReviews());
        System.out.println(myMovie.getAvarege());

        Serie theOffice = new Serie();
        theOffice.setReleaseYear(2002);
        theOffice.setTemporadas(9);
        theOffice.setEpisodiosPorTemporada(16);
        theOffice.setMinutosPorEpisodio(23);
        theOffice.setName("The Office");
        System.out.println("Duração para mara maratonar The Office: " + theOffice.getMinutesDurationTime());



    }
}
