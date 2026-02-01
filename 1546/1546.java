import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        int N = Integer.parseInt(br.readLine());
        int[] score = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        double max = 0;
        double sum = 0;
        
        for (int i = 0 ; i<N; i++){
            score[i] = Integer.parseInt(st.nextToken());

            if(score[i]>max){
                max = score[i];
            }        
        }
        for (int j = 0; j<score.length;j++){
            sum += score[j] / max *100;
        }



        System.out.print(sum/N);
    }
}