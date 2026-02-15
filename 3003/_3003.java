import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _3003 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] Chess = {1,1,2,2,2,8};
        int[] sum = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < Chess.length; i++) {
            sum[i] = Integer.parseInt(st.nextToken());
            Chess[i] = Chess[i] - sum[i];
        }

        for (int i = 0; i < Chess.length; i++) {
            System.out.print(Chess[i]+" ");
        }
    }    
}
