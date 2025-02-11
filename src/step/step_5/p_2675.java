package step.step_5;

import java.util.*;
import java.io.*;

/**
 * 문제이름: 문자열 반복
 */
public class p_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            String sRepeat = "";
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < r; k++) {
                    sRepeat += s.charAt(j);
                }
            }
            bw.write(sRepeat);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
