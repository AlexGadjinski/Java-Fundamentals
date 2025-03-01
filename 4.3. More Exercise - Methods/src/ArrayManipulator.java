import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println(Arrays.toString(array));
                return;
            }
            String[] command = input.split(" ");

            switch (command[0]) {
                case "exchange":
                    exchange(array, Integer.parseInt(command[1]));
                    break;
                case "min":
                    minEvenOdd(array, command[1]);
                    break;
                case "max":
                    maxEvenOdd(array, command[1]);
                    break;
                case "first":
                    firstEvenOdd(array, Integer.parseInt(command[1]), command[2]);
                    break;
                case "last":
                    lastEvenOdd(array, Integer.parseInt(command[1]), command[2]);
                    break;
            }
        }
    }

    public static void exchange(int[] array, int index) {
        int[] prev = array.clone();
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index");
            return;
        }
        int ind1 = 0;
        for (int i = index + 1; i < array.length; i++) {
            array[ind1++] = prev[i];
        }
        for (int i = 0; i <= index; i++) {
            array[ind1++] = prev[i];
        }
    }

    public static void minEvenOdd(int[] array, String evenOrOdd) {
        int resultIndex = -1;
        int minNum = Integer.MAX_VALUE;

        if (evenOrOdd.equals("odd")) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] % 2 != 0 && array[i] < minNum) {
                    minNum = array[i];
                    resultIndex = i;
                }
            }
        } else if (evenOrOdd.equals("even")) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] % 2 == 0 && array[i] < minNum) {
                    minNum = array[i];
                    resultIndex = i;
                }
            }
        }
        if (resultIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(resultIndex);
        }
    }

    public static void maxEvenOdd(int[] array, String evenOrOdd) {
        int resultIndex = -1;
        int maxNum = Integer.MIN_VALUE;
        if (evenOrOdd.equals("odd")) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] % 2 != 0 && array[i] > maxNum) {
                    maxNum = array[i];
                    resultIndex = i;
                }
            }
        } else if (evenOrOdd.equals("even")) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] % 2 == 0 && array[i] > maxNum) {
                    maxNum = array[i];
                    resultIndex = i;
                }
            }
        }
        if (resultIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(resultIndex);
        }
    }

    public static void firstEvenOdd(int[] array, int count, String evenOrOdd) {
        if (count > array.length) {
            System.out.println("Invalid count");
            return;
        }
        String numbers = "";
        if (evenOrOdd.equals("odd")) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    numbers += array[i] + ", ";
                    count--;
                }
                if (count == 0) {
                    break;
                }
            }
        } else if (evenOrOdd.equals("even")) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    numbers += array[i] + ", ";
                    count--;
                }
                if (count == 0) {
                    break;
                }
            }
        }
        if (numbers.equals("")) {
            System.out.println("[]");
            return;
        }
        String[] result = numbers.substring(0, numbers.length() - 2).split(", ");
        System.out.println(Arrays.toString(result));
    }

    public static void lastEvenOdd(int[] array, int count, String evenOrOdd) {
        if (count > array.length) {
            System.out.println("Invalid count");
            return;
        }
        String numbers = "";
        if (evenOrOdd.equals("odd")) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] % 2 != 0) {
                    numbers = array[i] + ", " + numbers;
                    count--;
                }
                if (count == 0) {
                    break;
                }
            }
        } else if (evenOrOdd.equals("even")) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] % 2 == 0) {
                    numbers = array[i] + ", " + numbers;
                    count--;
                }
                if (count == 0) {
                    break;
                }
            }
        }
        if (numbers.equals("")) {
            System.out.println("[]");
            return;
        }
        String[] result = numbers.substring(0, numbers.length() - 2).split(", ");
        System.out.println(Arrays.toString(result));
    }
}
