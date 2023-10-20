import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import static java.lang.Integer.*;

public class CalculatorMain {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter value: ");
        String values = br.readLine();

        List<String> tokens = getTokens(values);

        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        for (String token : tokens) {
            try {
                integers.add(parseInt(token));
            } catch (NumberFormatException e) {
                strings.add(token);
            }
        }

    }

    public static List<String> getTokens(String str) {
        ArrayList<String> tokens = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
        while (stringTokenizer.hasMoreTokens()) {
            tokens.add(stringTokenizer.nextToken());
        }
        return tokens;
    }

}
