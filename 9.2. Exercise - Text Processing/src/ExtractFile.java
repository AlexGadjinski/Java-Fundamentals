import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int indexOfFileName = input.lastIndexOf('\\') + 1;
        int indexOfExtension = input.indexOf('.') + 1;

        String fileName = input.substring(indexOfFileName, indexOfExtension - 1);
        String extension = input.substring(indexOfExtension);

        System.out.printf("File name: %s\n", fileName);
        System.out.printf("File extension: %s\n", extension);
    }
}
