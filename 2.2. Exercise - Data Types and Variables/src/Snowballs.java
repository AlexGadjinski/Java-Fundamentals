import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte numberOfSnowballs = Byte.parseByte(scanner.nextLine());
        int snowballValue = -1;
        String result = "";

        for (int i = 0; i < numberOfSnowballs; i++) {
            short snowballSnow = Short.parseShort(scanner.nextLine());
            short snowballTime = Short.parseShort(scanner.nextLine());
            byte snowballQuality = Byte.parseByte(scanner.nextLine());

            int currentValue = (int) Math.pow(((double) snowballSnow / snowballTime), snowballQuality);

            if (currentValue > snowballValue) {
                snowballValue = currentValue;
                result = String.format("%d : %d = %d (%d)", snowballSnow, snowballTime, snowballValue, snowballQuality);
            }
        }
        System.out.println(result);
    }
}
