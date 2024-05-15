import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int leftDigit;
    static int rightDigit;
    static String op;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пример");
        String[] array = scanner.nextLine().split(" ");
        leftDigit = Integer.parseInt(array[0]);
        rightDigit = Integer.parseInt(array[2]);
        op = array[1];
        System.out.println(calc());
    }
    public static String calc() {
        if (leftDigit > 10 || leftDigit <= 0) {
            throw new RuntimeException();
        }
        if (rightDigit > 10 || rightDigit <= 0) {
            throw new RuntimeException();
        }
        if (op.equals("+")) {
            return String.valueOf(leftDigit + rightDigit);
        }
        if (op.equals("-")) {
            return String.valueOf(leftDigit - rightDigit);
        }
        if (op.equals("*")) {
            return  String.valueOf(leftDigit * rightDigit);
        }
        if (op.equals("/")) {
            return String.valueOf( leftDigit / rightDigit);
        }
        throw new RuntimeException();
    }
}