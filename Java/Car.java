public class Car {
    Integer id;
    String license;
    String driver;
    Integer passenger;

    void printDataCar() { // method to print the data of the car object
        System.out.println("Car license: " + license);
        System.out.println("Car driver: " + driver);
        System.out.println("Car passenger: " + passenger);
    }
}
