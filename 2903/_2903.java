import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class _2903 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = 1;

        for (int i = 0; i < N; i++) {
            M *= 2;
        }
        br.close();
        System.out.println((M+1)*(M+1));  

        //비트 시프트 방식
        // int N = Integer.parseInt(br.readLine());
        // int M = ( 1 << N )+1;

        // System.out.println(M*M);
        

    }
}
