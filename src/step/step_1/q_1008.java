package step.step_1;

import java.io.*;
import java.util.StringTokenizer;

/**
 * ?? ??: 1008
 * ?? ??: A/B
 */

public class q_1008 {
    public static void main(String[] args) throws IOException, NumberFormatException {
        double a,b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Double.parseDouble(st.nextToken());
        b = Double.parseDouble(st.nextToken());

        bw.write(String.valueOf(a / b));
        bw.close();
    }
}
