package step.step_8;

import java.util.*;
import java.io.*;

public class p_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        String result = "";
        while (n > 0) {
            int mok = n / b; // 몫
            int na = n % b; // 나머지


            result += getChar(na);
            if (mok == 0) { // 몫이 0이 되는 순간
                n = 0;
            } else { // 몫이 있는 경우
                n = mok;
            }
        }

        for (int i = result.length() - 1; i >= 0; i--) {
            bw.write(result.charAt(i) + "");
        }
        br.close();
        bw.close();
    }

    public static char getChar(int a) {
        if (a >= 0 && a <= 9) return (char) (a + 48);
        else return (char) (a + 55);
    }
}
