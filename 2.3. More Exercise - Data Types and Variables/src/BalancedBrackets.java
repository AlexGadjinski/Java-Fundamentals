import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        boolean isBalanced = true;
        boolean isOpened = true;
        boolean isClosed = false;
        boolean isWithStringBetweenBrackets = false;
        boolean isWithStringOutsideBrackets = false;
        int start = 0;
        boolean withBrackets = false;


        for (int i = 0; i < lines; i++) {
            String input = scanner.nextLine();
            if (!isBalanced) {
                continue;
            }
            if (input.charAt(0) == 41) {
                isBalanced = false;
            }
            if (input.charAt(0) == 40) {
                start = i+1;
                withBrackets = true;
                break;
            }
        }
        if (!isBalanced) {
            System.out.println("UNBALANCED");
            return;
        } else if (!withBrackets) {
            System.out.println("BALANCED");
            return;
        }

        for (int i = start; i < lines; i++) {
            String input = scanner.nextLine();
            if (!isBalanced) {
                continue;
            }
            if (input.charAt(0) != 40 && input.charAt(0) != 41) {
                if (isOpened) {
                    isWithStringBetweenBrackets = true;
                } else {
                    isWithStringOutsideBrackets = true;
                }
            } else if (input.charAt(0) == 41) {
                if (isWithStringBetweenBrackets) {
                    isClosed = true;
                    isOpened = false;
                    isWithStringBetweenBrackets = false;
                    isWithStringOutsideBrackets = false;
                } else {
                    isBalanced = false;
                }
            } else if (input.charAt(0) == 40) {
                if (isOpened) {
                    isBalanced = false;
                } else if (isWithStringOutsideBrackets && isClosed) {
                    isOpened = true;
                    isClosed = false;
                    isWithStringBetweenBrackets = false;
                }  else {
                    isBalanced = false;
                }
            }
        }


        if (isBalanced && !isOpened && isClosed) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
