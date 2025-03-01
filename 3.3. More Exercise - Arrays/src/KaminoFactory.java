import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int bestIndex = Integer.MAX_VALUE;
        int biggestSum = 0;
        int biggestSequence = 0;
        String[] result = null;
        int counterOfInputs = 0;
        int bestInput = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Clone them!")) {
                break;
            }
            int sum = 0;
            int index = Integer.MAX_VALUE;
            int longestSequence = 0;
            int currentSequence = 0;
            counterOfInputs++;

            String array = "";
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 48 || input.charAt(i) == 49) {
                    array += input.charAt(i);
                }
            }
            String[] currentDNA = array.split("");
            for (int i = 0; i < currentDNA.length; i++) {
                if (currentDNA[i].equals("1")) {
                    sum += 1;
                    currentSequence += 1;
                    if (currentSequence > longestSequence) {
                        longestSequence = currentSequence;
                        index = i - currentSequence + 1;
                    }
                } else {
                    currentSequence = 0;
                }
            }
            if (longestSequence > biggestSequence) {
                biggestSum = sum;
                biggestSequence = longestSequence;
                bestIndex = index;
                result = currentDNA;
                bestInput = counterOfInputs;
            } else if (longestSequence == biggestSequence) {
                if (index < bestIndex) {
                    biggestSum = sum;
                    bestIndex = index;
                    result = currentDNA;
                    bestInput = counterOfInputs;
                } else if (index == bestIndex) {
                    if (sum > biggestSum) {
                        biggestSum = sum;
                        result = currentDNA;
                        bestInput = counterOfInputs;
                    } else if (result == null) {
                        bestInput = counterOfInputs;
                        result = currentDNA;
                    }
                }
            }
        }
        System.out.printf("Best DNA sample %d with sum: %d.\n", bestInput, biggestSum);
        System.out.println(String.join(" ", result));
    }
}
