import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder spell = new StringBuilder(scanner.nextLine());

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Abracadabra")) {
                break;
            }
            String[] command = input.split(" ");

            switch (command[0]) {
                case "Abjuration":
                    spell.replace(0, spell.length(), spell.toString().toUpperCase());
                    System.out.println(spell);
                    break;
                case "Necromancy":
                    spell.replace(0, spell.length(), spell.toString().toLowerCase());
                    System.out.println(spell);
                    break;
                case "Illusion":
                    int index = Integer.parseInt(command[1]);
                    char letter = command[2].charAt(0);

                    if (index < 0 || index >= spell.length()) {
                        System.out.println("The spell was too weak.");
                    } else {
                        spell.deleteCharAt(index);
                        spell.insert(index, letter);
                        System.out.println("Done!");
                    }
                    break;
                case "Divination":
                    String firstSubstring = command[1];
                    String secondSubstring = command[2];
                    spell.replace(0, spell.length(), spell.toString().replace(firstSubstring, secondSubstring));
                    System.out.println(spell);
                    break;
                case "Alteration":
                    String substring = command[1];
                    spell.replace(0, spell.length(), spell.toString().replace(substring, ""));
                    System.out.println(spell);
                    break;
                default:
                    System.out.println("The spell did not work!");
            }
        }
    }
}
