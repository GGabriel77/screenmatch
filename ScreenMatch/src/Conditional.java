public class Conditional {
    public static void main(String[] args) {
        int releaseYear = 2014;
        boolean addedOnThePlan = true;
        double movieRate = 9.0;
        String planType = "Normal";

        if (releaseYear > 2023) {
            System.out.println("Releases that people enjoyed!");
        } else {
            System.out.println("Old movie that's good to watch!");
        }

        if (addedOnThePlan && planType.equals("Plus")) {
            System.out.println("Movie Free");
        } else {
            System.out.println("This one is not a Plus member. The movie isn't free to watch.");
        }
    }
}
