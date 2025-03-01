import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        switch (type) {
            case "string":
                String string1 = scanner.nextLine();
                String string2 = scanner.nextLine();
                System.out.println(getMax(string1, string2));
                break;
            case "int":
                int num1 = Integer.parseInt(scanner.nextLine());
                int num2 = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(num1, num2));
                break;
            case "char":
                char symbol1 = scanner.next().charAt(0);
                char symbol2 = scanner.next().charAt(0);
                System.out.println(getMax(symbol1,symbol2));
                break;
        }
    }

    public static String getMax(String input1, String input2) {
        if (input1.compareTo(input2) >= 0) {
            return input1;
        } else {
            return input2;
        }
    }
    public static char getMax(char input1, char input2) {
        if (input1 > input2) {
            return input1;
        } else {
            return input2;
        }
    }
    public static int getMax(int input1, int input2) {
        if (input1 > input2) {
            return input1;
        } else {
            return input2;
        }
    }
}
