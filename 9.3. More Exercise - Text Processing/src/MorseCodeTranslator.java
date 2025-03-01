import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("[ ][|][ ]");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length; i++) {
            String[] letters = input[i].split(" ");
            for (int j = 0; j < letters.length; j++) {
                result.append(giveLetter(letters[j]));
            }
            result.append(" ");
        }
        System.out.println(result);
    }

    static String giveLetter(String code) {
        switch (code) {
            case ".-":
                return "A";
            case "-...":
                return "B";
            case "-.-.":
                return "C";
            case "-..":
                return "D";
            case ".":
                return "E";
            case "..-.":
                return "F";
            case "--.":
                return "G";
            case "....":
                return "H";
            case "..":
                return "I";
            case ".---":
                return "J";
            case "-.-":
                return "K";
            case ".-..":
                return "L";
            case "--":
                return "M";
            case "-.":
                return "N";
            case "---":
                return "O";
            case ".--.":
                return "P";
            case "--.-":
                return "Q";
            case ".-.":
                return "R";
            case "...":
                return "S";
            case "-":
                return "T";
            case "..-":
                return "U";
            case "...-":
                return "V";
            case ".--":
                return "W";
            case "-..-":
                return "X";
            case "-.--":
                return "Y";
            case "--..":
                return "Z";
            default:
                return "";
        }
    }
}
