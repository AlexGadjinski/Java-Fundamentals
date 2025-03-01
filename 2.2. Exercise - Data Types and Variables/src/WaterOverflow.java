import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = Byte.parseByte(scanner.nextLine());
        short liters = 0;

        for (int i = 0; i < n; i++) {
            short input = Short.parseShort(scanner.nextLine());
            if (liters + input > 255) {
                System.out.println("Insufficient capacity!");
                continue;
            }
            liters += input;
        }
        System.out.println(liters);
    }
}
