package step.step_6;

import java.util.*;
import java.io.*;

/**
 * 문제 이름: 팰린드롬인지 확인하기
 */
public class p_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        boolean check = true;
        for (int i = 0; i < s.length() / 2 + 1; i++) {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                check = false;
                break;
            }
        }

        if (check) bw.write("1");
        else bw.write("0");
        br.close();
        bw.close();
    }
}
