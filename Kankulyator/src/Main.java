import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        System.out.println("1-son = ");
        int num1 = scanner.nextInt();
        String n = scanner.next();
        System.out.println("2-son = ");

        int num2 = scanner.nextInt();
        int res = 0;


        switch (n) {
            case "+" -> {
                res = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + res);
            }
            case "-" -> {
                res = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + res);
            }
            case "*" -> {
                res = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + res);
            }
            case "/" -> {
                res = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + res);
            }
            default -> System.out.println("error");

        }
    }
}