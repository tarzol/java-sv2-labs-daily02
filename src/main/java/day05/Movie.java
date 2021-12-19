package day05;

public class Movie {

    private String title;
    private int dateOfManufacturing;
    private double averageOfEvaluations;
    private int noOfEvaluations = 4;
    private int sumOfEvaluations = 12;

    public Movie(String title, int dateOfManufacturing) {
        this.title = title;
        this.dateOfManufacturing = dateOfManufacturing;
    }

    public double calculateAverageOfEvaluations(int evaluation) {
        averageOfEvaluations = (double)(sumOfEvaluations+evaluation)/(noOfEvaluations+1);
        //System.out.println("Average:"+averageOfEvaluations);
        setAverageOfEvaluations(averageOfEvaluations);
        return averageOfEvaluations;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDateOfManufacturing() {
        return dateOfManufacturing;
    }

    public void setDateOfManufacturing(int dateOfManufacturing) {
        this.dateOfManufacturing = dateOfManufacturing;
    }

    public double getAverageOfEvaluations() {
        return averageOfEvaluations;
    }

    public void setAverageOfEvaluations(double averageOfEvaluations) {
        this.averageOfEvaluations = averageOfEvaluations;
    }

    public int getNoOfEvaluations() {
        return noOfEvaluations;
    }

    public void setNoOfEvaluations(int noOfEvaluations) {
        this.noOfEvaluations = noOfEvaluations;
    }

    public int getSumOfEvaluations() {
        return sumOfEvaluations;
    }

    public void setSumOfEvaluations(int sumOfEvaluations) {
        this.sumOfEvaluations = sumOfEvaluations;
    }
}
