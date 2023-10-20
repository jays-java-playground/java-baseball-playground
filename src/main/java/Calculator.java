import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 입력 값: ");
        int first = scanner.nextInt();
        System.out.println(first);

        System.out.print("두 번째 입력 값: ");
        int second = scanner.nextInt();
        System.out.println(second);

        System.out.print("사칙연산 기호를 입력: ");
        String exp = scanner.next();
        System.out.println(exp);

        if ("+".equals(exp)) {
            System.out.println("덧셈: " + (first + second));
        } else if ("-".equals(exp)) {
            System.out.println("뺄셈: " + (first - second));
        } else if ("*".equals(exp)) {
            System.out.println("곱셈: " + (first * second));
        } else if ("/".equals(exp)) {
            System.out.println("나눗셈: " + (first / second));
        } else {
            System.out.println("wrong expression");
        }
    }
}
