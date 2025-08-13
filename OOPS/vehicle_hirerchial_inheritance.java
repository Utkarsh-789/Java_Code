// Base class
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    public void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

// Subclass 1: Road Vehicle
class RoadVehicle extends Vehicle {
    public void driveOnRoad() {
        System.out.println("Driving on road.");
    }
}

// Subclass 2: Rail Vehicle
class RailVehicle extends Vehicle {
    public void runOnRail() {
        System.out.println("Running on rail.");
    }
}

// Subclass 3: Air Vehicle
class AirVehicle extends Vehicle {
    public void flyInAir() {
        System.out.println("Flying in air.");
    }
}

// Subclass 4: Water Vehicle
class WaterVehicle extends Vehicle {
    public void sailOnWater() {
        System.out.println("Sailing on water.");
    }
}

// Main class to test
public class vehicle_hirerchial_inheritance {
    public static void main(String[] args) {
        // Road vehicle
        System.out.println("=== Road Vehicle ===");
        RoadVehicle car = new RoadVehicle();
        car.start();
        car.driveOnRoad();
        car.stop();

        // Rail vehicle
        System.out.println("\n=== Rail Vehicle ===");
        RailVehicle train = new RailVehicle();
        train.start();
        train.runOnRail();
        train.stop();

        // Air vehicle
        System.out.println("\n=== Air Vehicle ===");
        AirVehicle plane = new AirVehicle();
        plane.start();
        plane.flyInAir();
        plane.stop();

        // Water vehicle
        System.out.println("\n=== Water Vehicle ===");
        WaterVehicle ship = new WaterVehicle();
        ship.start();
        ship.sailOnWater();
        ship.stop();
    }
}
