import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSum = 0;
        String input = scanner.nextLine();

        while (!input.equals("Start")) {
            double currentNum = Double.parseDouble(input);
            if (currentNum != 0.1 && currentNum != 0.2 && currentNum != 0.5 && currentNum != 1 && currentNum != 2) {
                System.out.printf("Cannot accept %.2f", currentNum);
                System.out.println();
            } else {
                totalSum += currentNum;
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("End")) {
            if (input.equals("Nuts")) {
                if (totalSum - 2.0 >= 0) {
                    totalSum -= 2.0;
                    System.out.println("Purchased Nuts");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Water")) {
                if (totalSum - 0.7 >= 0) {
                    totalSum -= 0.7;
                    System.out.println("Purchased Water");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Crisps")) {
                if (totalSum - 1.5 >= 0) {
                    totalSum -= 1.5;
                    System.out.println("Purchased Crisps");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Soda")) {
                if (totalSum - 0.8 >= 0) {
                    totalSum -= 0.8;
                    System.out.println("Purchased Soda");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Coke")) {
                if (totalSum - 1.0 >= 0) {
                    totalSum -= 1.0;
                    System.out.println("Purchased Coke");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else {
                System.out.println("Invalid product");
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalSum);
    }
}
