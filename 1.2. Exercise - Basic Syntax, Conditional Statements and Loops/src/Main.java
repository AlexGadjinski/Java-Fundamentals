public class Main {
    public static void main(String[] args) {
        /* System.out.println(Math.round(45.45));
        System.out.println(Math.round(45.55));
        System.out.println();


        char symbol = '1';
        System.out.println(symbol);
        System.out.println((int) symbol);
        String sym = symbol + "";
        int number = Integer.parseInt(sym);
        System.out.println(number);

        int num = Integer.parseInt(symbol + ""); */

        int[] a = new int[5];
        int i = 1;
        a[i] = 10;
        a[++i] = a[i] + 2;
        a[i++] = a[i] + 4;
    }
}
