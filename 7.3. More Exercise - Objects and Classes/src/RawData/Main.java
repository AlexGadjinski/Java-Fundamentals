package RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            Car car = new Car(input[0], input[1], input[2], input[3], input[4], input[5],
                    input[6], input[7], input[8], input[9], input[10], input[11], input[12]);
            cars.add(car);
        }
        String input = scanner.nextLine();
        if (input.equals("fragile")) {
            for (Car car : cars) {
                if (car.cargo.isFragile) {
                    System.out.println(car.model);
                }
            }
        } else if (input.equals("flamable")) {
            for (Car car : cars) {
                if (car.cargo.isFlamable) {
                    System.out.println(car.model);
                }
            }
        }
    }
}
