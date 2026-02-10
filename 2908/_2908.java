import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s1 = st.nextToken();
        String s2 = st.nextToken();
        String r1 = "";
        String r2 = "";

        for (int i = s1.length() - 1; i >= 0; i--) {
            r1 += s1.charAt(i);
        }

        for (int i = s2.length() - 1; i >= 0; i--) {
            r2 += s2.charAt(i);
        }

        if (Integer.parseInt(r1) > Integer.parseInt(r2)) {
            System.out.println(r1);
        } else {
            System.out.println(r2);
        }
    }
}
