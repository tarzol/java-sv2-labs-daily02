package day04;

public class Car {

    private int fuelQuantity;
    private int distanceInKm;

    public void setFuelQuantity(int fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double averageConsumption() {
        return (double)fuelQuantity/distanceInKm*100;
    }

    public void setDistanceInKm(int distanceInKm) {
        this.distanceInKm = distanceInKm;
    }
}
