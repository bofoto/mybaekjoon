import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] A = new int[42];
        int count = 0;
        for(int i=0; i<10;i++){
            int input = Integer.parseInt(br.readLine());
            A[input % 42]= 1;
        }
        for(int num : A){
            if(num==1) count++;
        }
        System.out.print(count);
        br.close();
    }
}