import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int result = getValue(bufferedReader);

        while (true) {
            String operator = getOperator(bufferedReader);
            if (Objects.equals(operator, "quit")) {
                printResult(result);
                break;
            }
            int value = getValue(bufferedReader);
            result = getResult(operator, result, value);
        }
    }

    private static int getResult(String operator, int result, int value) {
        switch (operator) {
            case "+":
                result += value;
                System.out.println("덧셈 = " + result);
                break;
            case "-":
                result -= value;
                System.out.println("뺄셈 = " + result);
                break;
            case "*":
                result *= value;
                System.out.println("곱셈 = " + result);
                break;
            case "/":
                result /= value;
                System.out.println("나눗셈 = " + result);
                break;
        }
        return result;
    }

    private static int getValue(BufferedReader bufferedReader) throws IOException {
        System.out.print("숫자를 입력하세요: ");
        return Integer.parseInt(bufferedReader.readLine());
    }

    private static String getOperator(BufferedReader bufferedReader) throws IOException {
        System.out.print("사칙연산자를 입력하거나, quit을 입력하세요: ");
        return bufferedReader.readLine();
    }

    private static void printResult(int result) {
        System.out.println("최종 결과 값: " + result);
    }

}
