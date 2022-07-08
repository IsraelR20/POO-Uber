class Main{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Car car = new Car(); // create a new car object
        car.license = "ABC-123"; // assign a license to the car object
        car.driver="Jhon el conductor"; // assign a driver to the car object
        car.passenger = 4; // assign 3 passengers to the car object
        car.printDataCar(); // print the data of the car object

        Car car2 = new Car(); // create a new car object
        car2.license = "XYZ-456"; // assign a license to the car object
        car2.driver="Luis el conductor"; // assign a driver to the car object
        car2.passenger = 2; // assign 2 passengers to the car object
        car2.printDataCar(); // print the data of the car object
    }
}