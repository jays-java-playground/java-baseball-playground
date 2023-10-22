public class Calculate {
    static int calculate(String operator, int result, int value) {
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
}
