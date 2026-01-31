import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer stn = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stn.nextToken());
            int b = Integer.parseInt(stn.nextToken());

            bw.write("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b) + "\n");

        }

        bw.flush();
        bw.close();
        br.close();

    }
}
