import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer To;

    int T = Integer.parseInt(bfr.readLine());

    for (int i = 0; i < T; i++) {
      To = new StringTokenizer(bfr.readLine());
      bfw.write((Integer.parseInt(To.nextToken()) + Integer.parseInt(To.nextToken())) + "\n");
    }
    bfw.close();

  }
}