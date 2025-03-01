import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputType = scanner.nextLine();

        switch (inputType) {
            case "string":
                String input1 = scanner.nextLine();
                System.out.println(dataType(input1));
                break;
            case "int":
                int input2 = Integer.parseInt(scanner.nextLine());
                System.out.println(dataType(input2));
                break;
            case "real":
                double input3 = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.2f", dataType(input3));
                break;
        }
    }

    public static String dataType(String input) {
        return String.format("$%s$", input);
    }

    public static int dataType(int input) {
        return input * 2;
    }

    public static double dataType(double input) {
        return input * 1.5;
    }
}
