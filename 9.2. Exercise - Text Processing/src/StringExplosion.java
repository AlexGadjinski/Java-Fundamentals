import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());
        int strength = 0;

        for (int i = 0; i < sb.length(); ) {
            if (sb.charAt(i) == '>') {
                i++;
                strength += Integer.parseInt(String.valueOf(sb.charAt(i)));
                for (int j = i; j < sb.length(); ) {
                    if (strength == 0 || sb.charAt(j) == '>') {
                        break;
                    } else {
                        sb.deleteCharAt(j);
                        strength--;
                    }
                }
            } else {
                i++;
            }
        }
        System.out.println(sb);
    }
}
