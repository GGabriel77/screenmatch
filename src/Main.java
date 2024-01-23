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

        System.out.println(myMovie.plusRating);
        System.out.println(myMovie.allReviews);
        System.out.println(myMovie.getAvarege());
    }
}
