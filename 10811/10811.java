import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int tmp = 0;

        int[] buket = new int[N];


        for(int i =0; i<N;i++){
            buket[i]= i+1;
        }

        for(int a=0; a<M ;a++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st2.nextToken())-1;
            int j = Integer.parseInt(st2.nextToken())-1;

            while(i<j){
                tmp = buket[i];
                buket[i] = buket[j];
                buket[j] = tmp;
                i++;
                j--;
            }
        }
        br.close();
        for (int i=0 ;i<buket.length;i++){
            System.out.print(buket[i]+" ");
        }
    }
}