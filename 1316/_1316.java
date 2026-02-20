import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class _1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = N;

        for (int i = 0; i < N; i++) {
            String S = br.readLine();
            boolean Used[] = new boolean[26];
            for (int j = 0; j < S.length(); j++) {
                if (Used[S.charAt(j) - 'a'] == false) {
                    Used[S.charAt(j) - 'a'] = true;
                } else if (j > 0 && S.charAt(j) != S.charAt(j - 1)) {
                    count--;
                    break;
                }
            }
        }

        System.out.println(count);
        br.close();
    }
}
