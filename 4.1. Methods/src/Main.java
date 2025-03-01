import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result1 = 165.00008;
        double result2 = 165.00005;
        // става така заради някаква банкова логика, която е внедрена в Java

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result1));
        System.out.println(df.format(result2));
    }
}
