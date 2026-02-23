import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char arr[][] = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                arr[i][j] = input.charAt(j);
            }
        }

        for (int k = 0; k < 15; k++) {
            for (int l = 0; l < 5; l++) {
                if (arr[l][k] == '\0') continue;                
                System.out.print(arr[l][k]);
            }
        }
    }
}
