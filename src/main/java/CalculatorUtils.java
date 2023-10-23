import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CalculatorUtils {

    /**
     * 계산기 구현 시 수식의 첫 번째 값을 추출하는 역할.
     * 수식이 숫자로 시작하지 않는다면 에러 메시지를 출력한다.
     * @param tokens
     * @return result
     */
    static int setInitialValue(List<String> tokens) {
        int result = 0;
        try {
            result = Integer.parseInt(tokens.get(0));
        } catch (NumberFormatException e) {
            System.out.println("Error: 수식은 숫자로 시작해야 합니다.");
        }
        return result;
    }

    /**
     * 입력 받은 수식 문자열을 공백을 기준으로 분리한다.
     * @param str
     * @return tokens
     */
    static ArrayList<String> getTokens(String str) {
        ArrayList<String> tokens = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
        while (stringTokenizer.hasMoreTokens()) {
            tokens.add(stringTokenizer.nextToken());
        }
        return tokens;
    }
}
