public class Movie {
    String name;
    String description;
    double plusRating;
    int releaseYear;
    int allReviews;
    boolean includedPLan;
    int movieTime;

    void showMovieDescription(){
        System.out.println("Nome do filme: " + name + ".");
        System.out.println("Ano de lançamento: " + releaseYear + ".");
        System.out.println("Tempo de filme em minutos: " + movieTime);
    }

    void ratingValiation(double rate){
        plusRating += rate;
        allReviews++;
    }

    double getAvarege(){
        return plusRating / allReviews;
    }

}
