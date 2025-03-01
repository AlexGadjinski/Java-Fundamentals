import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= input; i++) {
            printTriangle(1, i);
        }
        for (int i = input-1; i >= 1; i--) {
            printTriangle(1, i);
        }
    }
    
    public static void printTriangle(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
