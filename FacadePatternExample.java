// Subsystem class 1
class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

// Subsystem class 2
class FuelInjector {
    public void injectFuel() {
        System.out.println("Fuel injected");
    }
}

// Subsystem class 3
class AirFlowController {
    public void controlAirFlow() {
        System.out.println("Air flow controlled");
    }
}

// Facade class
class CarFacade {
    private Engine engine;
    private FuelInjector fuelInjector;
    private AirFlowController airFlowController;

    public CarFacade() {
        engine = new Engine();
        fuelInjector = new FuelInjector();
        airFlowController = new AirFlowController();
    }

    // Method to start the car
    public void startCar() {
        System.out.println("Starting car...");
        engine.start();
        fuelInjector.injectFuel();
        airFlowController.controlAirFlow();
        System.out.println("Car started");
    }
}

// Client code
public class FacadePatternExample {
    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();
        carFacade.startCar();
    }
}
