import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] chest = scanner.nextLine().split("\\|");
        while (true) {
            String[] command = scanner.nextLine().split(" ");
            switch (command[0]) {
                case "Loot":
                    chest = loot(command, chest);
                    break;
                case "Drop":
                    drop(chest, Integer.parseInt(command[1]));
                    break;
                case "Steal":
                    chest = steal(chest, Integer.parseInt(command[1]));
                    break;
                case "Yohoho!":
                    print(chest);
                    return;
            }
        }
    }
    public static String[] loot(String[] command, String[] chest) {
        String[] newItems = new String[0];
        boolean isNotIncluded = true;
        for (int i = command.length-1; i > 0; i--) {
            for (int j = 0; j < chest.length; j++) {
                if (command[i].equals(chest[j])) {
                    isNotIncluded = false;
                    break;
                }
            }
            if (isNotIncluded) {
                String[] last = newItems;
                newItems = new String[newItems.length + 1];
                for (int j = 0; j < last.length; j++) {
                    newItems[j] = last[j];
                }
                newItems[newItems.length-1] = command[i];
            }
            isNotIncluded = true;
        }
        /*for (int i = 0; i < newItems.length; i++) {
            for (int j = i + 1; j < newItems.length; j++) {
                if (newItems[j].charAt(0) < newItems[i].charAt(0)) {
                    String current = newItems[i];
                    newItems[i] = newItems[j];
                    newItems[j] = current;
                }
            }
        } в случай, че трябва да е сортирано, понеже не става ясно от условието */
        String[] lastChest = chest;
        chest = new String[chest.length + newItems.length];
        for (int i = 0; i < newItems.length; i++) {
            chest[i] = newItems[i];
        }
        int length = newItems.length;
        for (int i = 0; i < lastChest.length; i++) {
            chest[length++] = lastChest[i];
        }
        return chest;
    }
    public static void drop(String[] chest, int index) {
        if (index >= 0 && index < chest.length) {
            String lootForShift = chest[index];
            for (int i = index; i < chest.length - 1; i++) {
                chest[i] = chest[i + 1];
            }
            chest[chest.length - 1] = lootForShift;
        }
    }
    public static String[] steal(String[] chest, int number) {
        if (chest.length > 0) {
            int startIndex;
            if (number > chest.length) {
                startIndex = 0;
            } else {
                startIndex = chest.length - number;
            }
            String result = chest[startIndex];
            for (int i = startIndex + 1; i < chest.length; i++) {
                result += ", " + chest[i];
            }
            System.out.println(result);
            String[] lastChest = chest;

            chest = new String[startIndex];
            for (int i = 0; i < chest.length; i++) {
                chest[i] = lastChest[i];
            }
        }
        return chest;
    }
    public static void print(String[] chest) {
        int sum = 0;
        for (int i = 0; i < chest.length; i++) {
            sum += chest[i].length();
        }
        if (sum == 0) {
            System.out.println("Failed treasure hunt.");
        } else {
            System.out.printf("Average treasure gain: %.2f pirate credits.", (double) sum/chest.length);
        }
    }
}
