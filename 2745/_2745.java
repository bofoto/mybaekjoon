import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int sum = 1;
        int total = 0;

        for (int i = N.length()-1; i >= 0; i--) {
            char ch = N.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                total += (ch - 'A' + 10) * sum;
            } else {
                total += (ch - 'A') * sum;
            }
            sum *=B;
        }
        br.close();
        System.out.println(total);
    }
}
