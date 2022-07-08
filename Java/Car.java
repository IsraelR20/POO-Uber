public class Car { 
    Integer id;
    String license;
    Account driver; 
    Integer passenger;

    public Car(String license, Account driver){ // constructor
        this.license = license; 
        this.driver = driver;
    }

    void printDataCar() { // method to print the data of the car object
        System.out.println("Car license: " + license + "Driver: " + driver.name);
    }
}
