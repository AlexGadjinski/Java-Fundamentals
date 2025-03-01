import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|\\|");
        int fuel = Integer.parseInt(scanner.nextLine());
        int ammunition = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input.length; i++) {
            String[] command = input[i].split(" ");
            switch (command[0]) {
                case "Travel":
                    int lightYears = Integer.parseInt(command[1]);
                    fuel -= lightYears;
                    if (fuel >= 0) {
                        System.out.printf("The spaceship travelled %d light-years.\n", lightYears);
                    } else {
                        System.out.println("Mission failed.");
                        return;
                    }
                    break;
                case "Enemy":
                    int armor = Integer.parseInt(command[1]);
                    if (ammunition >= armor) {
                        System.out.printf("An enemy with %d armour is defeated.\n", armor);
                        ammunition -= armor;
                    } else {
                        fuel -= armor * 2;
                        if (fuel >= 0) {
                            System.out.printf("An enemy with %d armour is outmaneuvered.\n", armor);
                        } else {
                            System.out.println("Mission failed.");
                            return;
                        }
                    }
                    break;
                case "Repair":
                    int repairValue = Integer.parseInt(command[1]);
                    fuel += repairValue;
                    ammunition += repairValue * 2;
                    System.out.printf("Ammunitions added: %d.\n", repairValue * 2);
                    System.out.printf("Fuel added: %d.\n", repairValue);
                    break;
                case "Titan":
                    System.out.println("You have reached Titan, all passengers are safe.");
                    break;
            }
        }
    }
}
