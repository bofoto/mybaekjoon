import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] std = new int[31];
        for(int i =0; i<28 ;i++){
            int subId = Integer.parseInt(br.readLine());
            std[subId] = 1;
        }
        for (int i=1; i<std.length;i++){
            if(std[i] != 1){
                System.out.println(i);
            }
        }

        br.close();

    }
}