package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringCalculatorTest {
    /**
     * BufferedReader와 StringTokenizer를 사용해보기
     */
    public static void main(String[] args) throws IOException {
        //Integer.parseInt("/");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter string: ");
        String string = br.readLine();
        System.out.println(string);
        List<String> tokens = getTokens(string);
        System.out.println("tokens = " + tokens);

        for (String token : getTokens(string)) {
            System.out.println(token);
        }

    }

    public static List<String> getTokens(String str) {
        ArrayList<String> tokens = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(str, " ");
        while (tokenizer.hasMoreElements()) {
            tokens.add(tokenizer.nextToken());
        }
        return tokens;
    }
}
