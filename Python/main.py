from car import Car # Import the class Car from the file car.py
print("Hello World!")
car1=Car() # Create an instance of the class Car
car1.license="ABC123" # Set the license of the car
car1.driver="John el conductor" # Set the driver of the car
print(vars(car1)) # Print the attributes of the car1 instance

car2=Car() # Create an instance of the class Car
car2.license="XYZ789" # Set the license of the car
car2.driver="Rodrigo el conductor" # Set the driver of the car
print(vars(car2)) # Print the attributes of the car2 instance