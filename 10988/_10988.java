import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class _10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int Score = 1;

        if (S.length() % 2 == 1) {
            for (int i = 0; i < (S.length() - 1) / 2; i++) {
                if (S.charAt(i) == S.charAt((S.length() - 1) - i)) {
                    Score = Score;
                } else {
                    Score -= 1;
                }
            }
        } else {
            for (int i = 0; i < (S.length() + 1) / 2; i++) {
                if (S.charAt(i) == S.charAt((S.length() - 1) - i)) {
                    Score = Score;
                } else {
                    Score -= 1;
                }
            }
        }

        if (Score == 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        br.close();
    }
}
