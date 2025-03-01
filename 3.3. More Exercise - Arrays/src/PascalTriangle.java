import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        String[] array = {"1"};
        System.out.println(String.join(" ", array));

        for (int i = 2; i <= rows; i++) {
            if (i == 2) {
                array = new String[]{"1", "1"};
            } else {
                String[] newArray = new String[i];
                newArray[0] = "1";
                newArray[newArray.length-1] = "1";
                for (int j = 1; j < newArray.length-1; j++) {
                    newArray[j] = "" + (Integer.parseInt(array[j-1]) + Integer.parseInt(array[j]));
                }
                array = newArray;
            }
            System.out.println(String.join(" ", array));
        }
    }
}
