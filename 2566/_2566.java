import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[][] = new int[9][9];
        int Max = 0, row = 0, index = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (Max < arr[i][j]) {
                    Max = arr[i][j];
                    row = i+1;
                    index = j+1;
                }
            }
        }
        System.out.println(Max);
        System.out.println(row+" "+index);
    }
}
