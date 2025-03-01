import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String regex = "@[#]+[A-Z][A-Za-z\\d]{4,}[A-Z]@[#]+";
        Pattern pattern = Pattern.compile(regex);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                for (char symbol : matcher.group().toCharArray()) {
                    if (Character.isDigit(symbol)) {
                        sb.append(symbol);
                    }
                }
//                if (sb.isEmpty()) {
//                    sb.append("00");
//                }
                if (sb.length() == 0) {
                    sb.append("00");
                }
                System.out.printf("Product group: %s\n", sb);
            } else {
                System.out.println("Invalid barcode");
            }
            sb.setLength(0);
        }
    }
}
