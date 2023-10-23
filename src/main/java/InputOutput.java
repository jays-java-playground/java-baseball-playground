import java.io.BufferedReader;
import java.io.IOException;

public class InputOutput {
    static String getString(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void printResult(int result) {
        System.out.println("최종 결과 값: " + result);
    }
}
