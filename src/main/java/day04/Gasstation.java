package day04;

public class Gasstation {

    public int pricePerPetrol;

    public Gasstation(int pricePerPetrol) {
        this.pricePerPetrol = pricePerPetrol;
    }

    public int fuelInCar(Car car, int fuelInLiter) {
        car.setFuelQuantity(fuelInLiter);
        return fuelInLiter*pricePerPetrol;
    }

    public static void main(String[] args) {
        Car car1 = new Car();

        Gasstation gasstation1 = new Gasstation(480);
        System.out.println("Tankolás ára: "+gasstation1.fuelInCar(car1, 50));
        car1.setDistanceInKm(700);

        System.out.println("A fogy: "+car1.averageConsumption());
    }
}
