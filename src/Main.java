// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Uso: java sumePrefigo <números>");
            return;
        }

        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        int sumaPre = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumaPre += numbers[i];
            System.out.println(numbers[i] + ", " + sumaPre);
        }
    }
}