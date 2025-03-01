import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfPeople = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        switch (typeOfPeople) {
            case "Students":
                switch (day) {
                    case "Friday":
                        price = numOfPeople * 8.45;
                        break;
                    case "Saturday":
                        price = numOfPeople * 9.80;
                        break;
                    case "Sunday":
                        price = numOfPeople * 10.46;
                        break;
                }
                if (numOfPeople >= 30) {
                    price = price - ((15 * price)/100);
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        price = numOfPeople * 10.90;
                        if (numOfPeople >= 100) {
                            price = price - (10 * 10.90);
                        }
                        break;
                    case "Saturday":
                        price = numOfPeople * 15.60;
                        if (numOfPeople >= 100) {
                            price = price - (10 * 15.60);
                        }
                        break;
                    case "Sunday":
                        price = numOfPeople * 16;
                        if (numOfPeople >= 100) {
                            price = price - (10 * 15.60);
                        }
                        break;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        price = numOfPeople * 15;
                        break;
                    case "Saturday":
                        price = numOfPeople * 20;
                        break;
                    case "Sunday":
                        price = numOfPeople * 22.50;
                        break;
                }
                if (numOfPeople >= 10 && numOfPeople <= 20) {
                    price = price - ((5 * price)/100);
                }
                break;
        }
        System.out.printf("Total price: %.2f", price);
    }
}
