import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        String result = "int";
        
        for(int i = 1; i<=N/4; i++){
            result = "long "+ result;
        }
        
        System.out.println(result);
    }
}