import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        String maxArray = "";
        int maxCounter = 0;

        for (int i = 0; i < input.length; i++) {
            int currentCounter = 1;
            String currentNum = input[i];
            for (int j = i + 1; j < input.length; j++) {
                if (currentNum.equals(input[j])) {
                    currentCounter++;
                } else {
                    i += currentCounter - 1;
                    break;
                }
            }
            if (currentCounter > maxCounter) {
                maxCounter = currentCounter;
                maxArray = currentNum;
                for (int j = 1; j < maxCounter; j++) {
                    maxArray += " " + currentNum;
                }
            }
        }
        System.out.println(maxArray);
    }
}
