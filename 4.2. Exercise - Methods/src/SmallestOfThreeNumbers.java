import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input1 = Integer.parseInt(scanner.nextLine());
        int input2 = Integer.parseInt(scanner.nextLine());
        int input3 = Integer.parseInt(scanner.nextLine());

        System.out.println(smallestNum(input1, input2, input3));
    }

    public static int smallestNum(int num1, int num2, int num3) {
        if (num1 < num2) {
            if (num3 < num1) {
                return num3;
            } else {
                return num1;
            }
        } else {
            if (num3 < num2) {
                return num3;
            } else {
                return num2;
            }
        }
    }
}
