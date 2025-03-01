import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {
        String type;
        String model;
        String color;
        String horsepower;
        public VehicleCatalogue(String type, String model, String color, String horsepower) {
            if (type.equals("car")) {
                this.type = "Car";
            } else {
                this.type = "Truck";
            }
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<VehicleCatalogue> cars = new ArrayList<>();
        List<VehicleCatalogue> trucks = new ArrayList<>();

        while(true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            String[] command = input.split(" ");
            VehicleCatalogue vehicle = new VehicleCatalogue(command[0], command[1], command[2], command[3]);
            if (command[0].equals("car")) {
                cars.add(vehicle);
            } else {
                trucks.add(vehicle);
            }
        }
        List<VehicleCatalogue> allVehicles = new ArrayList<>();
        allVehicles.addAll(cars);
        allVehicles.addAll(trucks);
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("Close the Catalogue")) {
                break;
            }
            for (VehicleCatalogue vehicle : allVehicles) {
                if (vehicle.model.equals(input)) {
                    System.out.println("Type: " + vehicle.type);
                    System.out.println("Model: " + vehicle.model);
                    System.out.println("Color: " + vehicle.color);
                    System.out.println("Horsepower: " + vehicle.horsepower);
                    break;
                }
            }
        }
        double carHorsePower = 0;
        double truckHorsePower = 0;
        for (VehicleCatalogue car : cars) {
            carHorsePower += Double.parseDouble(car.horsepower);
        }
        for (VehicleCatalogue truck : trucks) {
            truckHorsePower += Double.parseDouble(truck.horsepower);
        }
        if (carHorsePower != 0) {
            carHorsePower /= cars.size();
        }
        if (truckHorsePower != 0) {
            truckHorsePower /= trucks.size();
        }
        System.out.printf("Cars have average horsepower of: %.2f.\n", carHorsePower);
        System.out.printf("Trucks have average horsepower of: %.2f.\n", truckHorsePower);
    }
}
