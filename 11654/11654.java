import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char ascii = br.readLine().charAt(0);
        int num = (int)ascii;
            
        System.out.print(num);
    }
}