import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пример");
        String[] array = scanner.nextLine().split(" ");

        System.out.println(calc(array));
    }
    public static String calc(String[] array) {
        int leftDigit = Integer.parseInt(array[0]);
        int rightDigit = Integer.parseInt(array[2]);
        String operation = array[1];
        String result = operation(leftDigit, operation, rightDigit);
        return result;
    }

    public static String operation(int leftDigit, String operation, int rightDigit){
        if (leftDigit > 10 || leftDigit <= 0) {
            throw new RuntimeException();
        }
        if (rightDigit > 10 || rightDigit <= 0) {
            throw new RuntimeException();
        }
        if (operation.equals("+")) {
            return String.valueOf(leftDigit + rightDigit);
        }
        if (operation.equals("-")) {
            return String.valueOf(leftDigit - rightDigit);
        }
        if (operation.equals("*")) {
            return String.valueOf(leftDigit * rightDigit);
        }
        if (operation.equals("/")) {
            return String.valueOf(leftDigit / rightDigit);
        }
        throw new RuntimeException();
    }

}