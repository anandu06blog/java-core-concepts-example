package pattern.creationalDesignPattern.factoryPattern;
// Factory Interface
interface VehicleFactory {
    Vehicle createVehicle();
}

// Concrete Factory for creating Cars
class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

// Concrete Factory for creating Bikes
class BikeFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}

// Vehicle Interface
interface Vehicle {
    void drive();
}

// Car class implementing Vehicle
class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}

// Bike class implementing Vehicle
class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a bike");
    }
}

// Main program
public class FactoryPatternExampleByVechile {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.drive();

        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.drive();
    }
}

