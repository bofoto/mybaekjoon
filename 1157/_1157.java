import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int[] num = new int[26];
        for (int i = 0; i < S.length(); i++) {
            num[S.toUpperCase().charAt(i) - 65]++;
        }

        int max = 0;
        int index = -1;
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
                index = i;
            }
        }
        for (int i = 0; i < num.length; i++) {
            if (i == index) {
                continue;
            }
            if (num[i]==max){
                System.out.println("?");
                return;
            }
        }

        System.out.println((char)(index+65));

    }
}
