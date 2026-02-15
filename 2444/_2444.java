import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class _2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 2 * N - 1; i++) {
        if (i<=N) {
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        } else {
            for (int j = 0; j < i-N; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*(2 * N-i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
        br.close();

    }
}
