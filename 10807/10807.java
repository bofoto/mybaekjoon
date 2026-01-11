import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] M = new int[N];
        int sum = 0;

        for(int i = 0; i<N; i++){
            M[i] = Integer.parseInt(st.nextToken());
        }

        int L = Integer.parseInt(br.readLine());

        for(int j=0; j<M.length; j++){
            if(L==M[j]){
                sum++;
            }
        }
        bw.write(String.valueOf(sum));

        br.close();
        bw.flush();
        bw.close();


    }
}