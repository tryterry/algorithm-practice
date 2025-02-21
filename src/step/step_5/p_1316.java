package step.step_5;

import java.io.*;
import java.util.*;

/**
 * 그룹 단어 체커
 */
public class p_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            count += checkGroup(input);
        }

        bw.write(count + "");
        br.close();
        bw.close();
    }

    public static int checkGroup(String s) {
        int flag = 1;
        for (int i = 0; i < s.length(); i++) {
            int different = 1; //
            for (int j = i + 1; j < s.length(); j++) {
                if (different <= 0 && s.charAt(i) == s.charAt(j)) {
                    flag = 0;
                    break;
                }
                if (s.charAt(i) != s.charAt(j)){
                    different -= 1;
                }
            }
            if (flag == 0) break;
        }
        return flag;
    }
}
