class Main{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Car car = new Car("ABC-123",new Account("Andres el conductor", "AMD123")); // create a new car object
        car.passenger = 4; // assign 3 passengers to the car object
        car.printDataCar(); // print the data of the car object

        Car car2 = new Car("XYZ-456",new Account("Luis Gustavo el conductor", "XYZ123")); // create a new car object
        car2.passenger = 2; // assign 2 passengers to the car object
        car2.printDataCar(); // print the data of the car object
    }
}