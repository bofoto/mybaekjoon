import java.util.Scanner;

public class Main {
    public static int funt1(int a, int b, int c) {
        if( a > b && a > c) {
            return a;
        } else if(b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);


        int D1 = s.nextInt();
        int D2 = s.nextInt();
        int D3 = s.nextInt();
        

        int result = 0;
        
        if (D1==D2&&D2==D3&&D1==D3) {
            result = 10000+(D1*1000);
        } else if (D1==D2&&D2!=D3){
            result = 1000+(D1*100);
        } else if (D1==D3&&D1!=D2){
            result = 1000+(D1*100);
        } else if (D1!=D2&&D2==D3){
            result = 1000+(D2*100);
        } else if (D1!=D2&&D2!=D3&&D1!=D3){
            result = 100*funt1(D1, D2, D3);

        }
        System.out.println(D1+","+D2+","+D3);
        System.out.println(result);

    }
}