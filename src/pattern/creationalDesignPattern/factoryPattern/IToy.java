package pattern.creationalDesignPattern.factoryPattern;

/**
 * We have a Toy interface that defines the play method.
 * We have three classes (Car, Doll, Robot) that implement the Toy interface.
 * The ToyFactory class has a factory method createToy that creates different types of toys based on the input toyType.
 * In the Main class, we create a ToyFactory object and use it to create instances of different toys (Car, Doll, Robot) and play with them.
 * This example demonstrates how the factory pattern can be used to create different types of objects (toys in this case) without exposing the creation logic to the client code.
 */
public interface IToy {
public void play();     
}

class Car implements IToy{

    @Override
    public void play() {
        System.out.println("Playing With Car....");
    }
    
}

class Doll implements IToy{

    @Override
    public void play() {
        System.out.println("Playing With Doll....");
    }
    
}

class Robot implements IToy{

    @Override
    public void play() {
        System.out.println("Playing With Robot....");
    }
    
}

class factoryPatternExample {
    public static void main(String[] args) {
        ToyFactory toyFactory = new ToyFactory();

        // Create different types of toys using the factory
        IToy car = toyFactory.createToy("car");
        IToy doll = toyFactory.createToy("doll");
        IToy robot = toyFactory.createToy("robot");

        // Play with the toys
        car.play();
        doll.play();
        robot.play();
    }
}

// Toy Factory class
class ToyFactory {
    // Factory method to create different types of toys
    public IToy createToy(String toyType) {
        if (toyType.equalsIgnoreCase("car")) {
            return new Car();
        } else if (toyType.equalsIgnoreCase("doll")) {
            return new Doll();
        } else if (toyType.equalsIgnoreCase("robot")) {
            return new Robot();
        } else {
            return null;
        }
    }
}