//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int releaseYear = 2014;
        boolean addedOnThePlan = true;
        double movieRate = 9.0;
        double average = (9.8 + 7.5 + 9.0) / 3;
        //Casting explícito
        int rating = rating = (int) (average / 2);

        System.out.println(rating);
        String sinopse;
        sinopse = """
                  A great scientist movie!
                  The movie was a success!!
                  """;


        System.out.println("This is Screen Match");
        System.out.println("Movie: Interestrlar");

        System.out.println("Release Year: " + releaseYear);
        System.out.println("Have movie included on the plan: " + addedOnThePlan);
        System.out.println("The movie was rating with: " + movieRate);
        System.out.println("The average is: " + average);
        System.out.println(sinopse);
        }
}
