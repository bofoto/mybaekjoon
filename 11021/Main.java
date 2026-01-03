import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOExecption;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOExecption{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        Int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N;i++){
            st = new StringTokenizer(br.readLine());
            bw.write("Case #+"(i+1)"+: "+(Integer.parseInt(st.nextToken())+ Interger.parseInt(st.nextToken())) + "\n");
        }
        bw.close()
    }
}