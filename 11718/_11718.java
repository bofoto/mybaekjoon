import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class _11718 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            try {
                String S = br.readLine();
                if (S == null) {
                    break;
                    
                }else bw.write(S+"\n");
            } catch (Exception e) {
                break;
            }
            
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
