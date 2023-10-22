import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int result = Input.getValue(bufferedReader);

        while (true) {
            String operator = Input.getOperator(bufferedReader);
            if (Objects.equals(operator, "quit")) {
                Output.printResult(result);
                break;
            }
            int value = Input.getValue(bufferedReader);
            result = Calculate.calculate(operator, result, value);
        }
    }
}
