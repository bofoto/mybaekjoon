import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        StringBuilder stb = new StringBuilder();

        while (N > 0) {
            int re = N % B;

            char ch;
            if (re > 9) {
                ch = (char) ('A' + (re - 10));
            }else{
                ch = (char) ('0' + re);
            }

            stb.append(ch);

            N /= B;
        }
        stb.reverse();
        System.out.println(stb);

    }
}
