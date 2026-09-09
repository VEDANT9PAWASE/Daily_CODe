//Code To show multi-inheritance in java 

public class Vehicle {

    String brand = "Ford";
    int year = 2021;

    public void display() {
        System.out.println("Car Brand: " + brand + ", Year: " + year);
    }

    
    static class Car extends Vehicle {

        String modelName = "Mustang";

        @Override
        public void display() {
            System.out.println("Car Brand: " + brand +
                    ", Model: " + modelName +
                    ", Year: " + year);
        }
    }

    
    static class SportsCar extends Car {

        String type = "Sports Car";

        @Override
        public void display() {
            System.out.println("Car Brand: " + brand +
                    ", Model: " + modelName +
                    ", Type: " + type +
                    ", Year: " + year);
        }
    }

    public static void main(String[] args) {

        Vehicle myVehicle = new Vehicle();
        myVehicle.display();

        Car myCar = new Car();
        myCar.display();

        SportsCar mySportCar = new SportsCar();
        mySportCar.display();
    }
}
