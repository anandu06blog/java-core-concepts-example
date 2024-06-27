package pattern.creationalDesignPattern.factoryPattern;

interface IVehicleFactory {
    Vehicle createCar();
    Vehicle createBike();
}

// Concrete Factory for creating Modern Vehicles
class ModernVehicleFactory implements IVehicleFactory {
    @Override
    public Vehicle createCar() {
        return new ModernCar();
    }

    @Override
    public Vehicle createBike() {
        return new ModernBike();
    }
}

// Concrete Factory for creating Vintage Vehicles
class VintageVehicleFactory implements IVehicleFactory {
    @Override
    public Vehicle createCar() {
        return new VintageCar();
    }

    @Override
    public Vehicle createBike() {
        return new VintageBike();
    }
}

// Vehicle Interface
interface Vehicle {
    void drive();
}

// Modern Car class implementing Vehicle
class ModernCar implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a modern car");
    }
}

// Modern Bike class implementing Vehicle
class ModernBike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a modern bike");
    }
}

// Vintage Car class implementing Vehicle
class VintageCar implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a vintage car");
    }
}

// Vintage Bike class implementing Vehicle
class VintageBike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a vintage bike");
    }
}

// Main program
public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        IVehicleFactory modernFactory = new ModernVehicleFactory();
        Vehicle modernCar = modernFactory.createCar();
        modernCar.drive();

        IVehicleFactory vintageFactory = new VintageVehicleFactory();
        Vehicle vintageBike = vintageFactory.createBike();
        vintageBike.drive();
    }
}
