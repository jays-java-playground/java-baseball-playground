import java.io.BufferedReader;
import java.io.IOException;

public class Input {
    static int getValue(BufferedReader bufferedReader) throws IOException {
        System.out.print("숫자를 입력하세요: ");
        return Integer.parseInt(bufferedReader.readLine());
    }

    static String getOperator(BufferedReader bufferedReader) throws IOException {
        System.out.print("사칙연산자를 입력하거나, quit을 입력하세요: ");
        return bufferedReader.readLine();
    }
}
