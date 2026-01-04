import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int A;
        int B;

        for (int i=1; i<=N;i++){
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            //"Case #x: A + B = C"
            bw.write("Case #"+i+": ");
            bw.write(A +" + "+ B +" = ");
            bw.write((A+B)+ "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
