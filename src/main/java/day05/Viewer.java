package day05;

public class Viewer {

    public double watchMovie(Movie movie, int rating) {
        return movie.calculateAverageOfEvaluations(5);
    }

    public static void main(String[] args) {
        Viewer viewer1 = new Viewer();
        Movie movie1 = new Movie("Titanic", 1997);

        System.out.println("Átlagos értékelés: "+viewer1.watchMovie(movie1 , 5));
    }
}
