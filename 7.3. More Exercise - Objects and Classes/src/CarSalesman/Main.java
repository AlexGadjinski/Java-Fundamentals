package CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Engine> engines = new ArrayList<>();
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            if (command.length == 2) {
                Engine engine = new Engine(command[0], command[1]);
                engines.add(engine);
            } else if (command.length == 4) {
                Engine engine = new Engine(command[0], command[1], command[2], command[3]);
                engines.add(engine);
            } else if (command.length == 3) {
                Engine engine = new Engine(command[0], command[1], command[2]);
                engines.add(engine);
            }
        }
        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String[] command = scanner.nextLine().split(" ");
            if (command.length == 2) {
                Car car = new Car(engines, command[0], command[1]);
                cars.add(car);
            } else if (command.length == 4) {
                Car car = new Car(engines, command[0], command[1], command[2], command[3]);
                cars.add(car);
            } else if (command.length == 3) {
                Car car = new Car(engines, command[0], command[1], command[2]);
                cars.add(car);
            }
        }

        for (Car car : cars) {
            System.out.println(car.model + ":");
            System.out.println("\t" + car.engine.model + ":");
            System.out.println("\t\t" + "Power: " + car.engine.power);
            System.out.println("\t\t" + "Displacement: " + car.engine.displacement);
            System.out.println("\t\t" + "Efficiency: " + car.engine.efficiency);
            System.out.println("\t" + "Weight: " + car.weight);
            System.out.println("\t" + "Color: " + car.color);
        }
    }
}
