import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, double[]> orders = new LinkedHashMap<>();

        while(true) {
            String input = scanner.nextLine();
            if (input.equals("buy")) {
                break;
            }
            String[] commands = input.split(" ");

            String product = commands[0];
            double price = Double.parseDouble(commands[1]);
            int quantity = Integer.parseInt(commands[2]);

            double totalPrice = price * quantity;

            if (!orders.containsKey(product)) {
                orders.put(product, new double[2]);
                orders.get(product)[0] = totalPrice;
                orders.get(product)[1] = quantity;
            } else {
                double startPrice = orders.get(product)[0];
                double startQuantity = orders.get(product)[1];
                if (totalPrice + (startQuantity * price) != startPrice) {
                    orders.get(product)[0] = price * (quantity + startQuantity);
                    orders.get(product)[1] += quantity;
                }
            }

        }

        for (Map.Entry<String, double[]> entry : orders.entrySet()) {
            System.out.printf("%s -> %.2f\n", entry.getKey(), entry.getValue()[0]);
        }
    }
}
