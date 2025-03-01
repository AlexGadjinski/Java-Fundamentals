import java.util.*;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] key = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        while (true) {
            StringBuilder input = new StringBuilder(scanner.nextLine());
            if (input.toString().equals("find")) {
                break;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < input.length();) {
                for (int j = 0; j < key.length; j++) {
                    if (i == input.length()) {
                        break;
                    }
                    sb.append((char) (input.charAt(i) - key[j]));
                    i++;
                }
            }
            String result = sb.toString();
            int index1 = result.indexOf('&');
            int index2 = result.lastIndexOf('&');
            int index3 = result.indexOf('<');
            int index4 = result.indexOf('>');

            String type = result.substring(index1 + 1, index2);
            String coordinates = result.substring(index3 + 1, index4);

            System.out.printf("Found %s at %s\n", type, coordinates);
        }
    }
}
