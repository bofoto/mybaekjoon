import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++){
            String S = br.readLine(); // 입력이 변수 하나로 반복 되면 출력은 어떻게?
            char f = S.charAt(0);
            char l = S.charAt(S.length()-1);
            bw.write(f+""+l+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}