package br.com.screenmatch.model;

public class Movie {
    private String name;
    private String description;
    private double plusRating;
    private int releaseYear;
    private int allReviews;
    private boolean includedPLan;
    private int movieTime;

    int getAllReviews(){
        return allReviews;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean isIncludedPLan() {
        return includedPLan;
    }

    public void setIncludedPLan(boolean includedPLan) {
        this.includedPLan = includedPLan;
    }

    public int getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(int movieTime) {
        this.movieTime = movieTime;
    }

    public void showMovieDescription(){
        System.out.println("Nome do filme: " + name + ".");
        System.out.println("Ano de lançamento: " + releaseYear + ".");
        System.out.println("Tempo de filme em minutos: " + movieTime);
    }

    public void ratingValiation(double rate){
        plusRating += rate;
        allReviews++;
    }

    public double getAvarege(){
        return plusRating / allReviews;
    }

}
