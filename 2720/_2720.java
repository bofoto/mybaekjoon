import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class _2720{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int di[]={25, 10, 5, 1};
        for(int i = 0; i<T;i++){
            int result[] = new int[4];
            int C = Integer.parseInt(br.readLine());
            for (int j = 0; j < di.length; j++) {
                result[j] = C/di[j];
                C = C%di[j];

                System.out.print(result[j]+" ");
            }
            System.out.println();
        }

    }
}
