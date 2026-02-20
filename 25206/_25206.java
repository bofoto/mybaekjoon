import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _25206 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double count = 0;
        double sum = 0.0;
        double grades[] = new double[9];

        String ABC[] = { "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" };

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if (grade.equals("P")) {
                continue;
            }
            count += score;
            double num = 5.0;
            for (int j = 0; j < 9; j++) {
                num -= 0.5;
                if (grade.equals(ABC[j])) {
                    grades[j] += num * score;
                    break;
                }
            }
        }
        grades[8] = 0;

        for (int i = 0; i < 8; i++) {
            sum += grades[i];
        }

        System.out.println(sum/count);
    }
}