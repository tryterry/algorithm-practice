package step.step_10;

import java.io.*;
import java.util.*;


public class p_5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0 && c == 0) break;

            if ((a + b) <= c || (b + c) <= a || (c + a) <= b) bw.write("Invalid");
            else if (a == b && b == c && c == a) bw.write("Equilateral");
            else if (a != b && b != c && c != a) bw.write("Scalene");
            else bw.write("Isosceles");
            bw.write("\n");
        }

        br.close();
        bw.close();

    }
}
