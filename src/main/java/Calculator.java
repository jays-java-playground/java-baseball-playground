import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Calculator {
    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("계산할 수식을 한 번에 입력하세요: ");
        String expression = InputOutput.getString(bufferedReader);
        ArrayList<String> tokens = CalculatorUtils.getTokens(expression);

        int result = CalculatorUtils.setInitialValue(tokens);
        System.out.println("Initial number = " + result);

        for (int i = 1; i < tokens.size(); i += 2) {
            String operator = tokens.get(i);
            System.out.println("operator = " + operator);

            int number = Integer.parseInt(tokens.get(i + 1));
            System.out.println("next number = " + number);

            result = Calculate.calculate(operator, result, number);
        }
        InputOutput.printResult(result);
    }
}
