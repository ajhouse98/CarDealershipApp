import java.util.ArrayList;
import java.util.List;

public class Dealership {
    String name, address, phone;
    ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<Vehicle>();
    }

    public List<Vehicle> getVehicleByPrice(double min, double max) {

        return null;
    }
    public List<Vehicle> getVehicleByMakeModel(String make, String model) {

        return null;
    }

    public List<Vehicle> getVehicleByYear(int min, int max) {

        return null;
    }

    public List<Vehicle> getVehicleByColor(String color) {

        return null;
    }

    public List<Vehicle> getVehicleByMileage(int min, int max) {

        return null;
    }

    public List<Vehicle> getVehicleByType(String vehicleType) {

        return null;
    }

    public List<Vehicle> getAllVehicles() {

        return null;
    }


    public void addVehicle(Vehicle vehicle) {

        inventory.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle) {

        inventory.remove(vehicle);
    }
}
