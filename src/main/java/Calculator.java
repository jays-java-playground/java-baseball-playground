import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Calculator {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("숫자 입력: ");
        int first = Integer.parseInt(bufferedReader.readLine());
        System.out.println(first);

        int result = first;

        while (true) {

            System.out.print("사칙연산 기호를 입력: ");
            String exp = bufferedReader.readLine();
            System.out.println(exp);

            if (Objects.equals(exp, "quit")) {
                System.out.println("최종 결과 값: " + result);
                break;
            }

            System.out.print("숫자 입력: ");
            int second = Integer.parseInt(bufferedReader.readLine());
            System.out.println(second);

            switch (exp) {
                case "+":
                    result += second;
                    System.out.println("덧셈 = " + result);
                    break;
                case "-":
                    result -= second;
                    System.out.println("뺄셈 = " + result);
                    break;
                case "*":
                    result *= second;
                    System.out.println("곱셈 = " + result);
                    break;
                case "/":
                    result /= second;
                    System.out.println("나눗셈 = " + result);
                    break;
            }

        }

    }
}
