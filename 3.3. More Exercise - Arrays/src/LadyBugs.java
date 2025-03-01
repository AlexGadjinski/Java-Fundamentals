import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] indexesOfLadybugs = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] field = new int[fieldSize];
        for (int i = 0; i < indexesOfLadybugs.length; i++) {
            if (indexesOfLadybugs[i] < 0 || indexesOfLadybugs[i] >= field.length) {
                continue;
            }
            field[indexesOfLadybugs[i]] = 1;
        }

        while (true) {
            String[] input = scanner.nextLine().split(" ");
            if (input[0].equals("end")) {
                break;
            }
            int firstIndex = Integer.parseInt(input[0]);
            int step = Integer.parseInt(input[2]);
            if (firstIndex >= 0 && firstIndex < field.length) {
                if (field[firstIndex] == 1 && step != 0) {
                    if ((input[1].equals("right") && step > 0) ||
                            (input[1].equals("left") && step < 0)) {
                        field[firstIndex] = 0;
                        for (int i = firstIndex + Math.abs(step); i < field.length; i += step) {
                            if (field[i] != 1) {
                                field[i] = 1;
                                break;
                            }
                        }
                    } else if ((input[1].equals("left") && step > 0) ||
                            (input[1].equals("right") && step < 0)) {
                        field[firstIndex] = 0;
                        for (int i = firstIndex - Math.abs(step); i >= 0; i -= step) {
                            if (field[i] != 1) {
                                field[i] = 1;
                                break;
                            }
                        }
                    }
                }
            }

        }
        String result = Arrays.toString(field);
        String[] result2 = result.substring(1, result.length()-1).split(", ");
        System.out.println(String.join(" ", result2));
    }
}
