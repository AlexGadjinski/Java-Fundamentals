import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int[] a = {num1, num2, num3};
        int[] b = new int[3];
        for (int i = 0; i < 3; i++) {
            insert(b, a[i], i);
        }
        for (int i = 2; i >= 0; i--) {
            System.out.println(b[i]);
        }
    }
    public static void insert (int[] b, int x, int i) {
        int j = locate(b, x, i);
        shift(b, j, i);
        b[j] = x;
    }
    public static int locate (int[] b, int x, int i) {
        int j = 0;
        while (j < i && x > b[j]) {
            j++;
        }
        return j;
    }
    public static void shift (int[] b, int j, int i) {
        for (int k = i; k > j; k--) {
            b[k] = b[k-1];
        }
    }
}
