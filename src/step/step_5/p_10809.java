package step.step_5;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 알파벳 찾기
 */
public class p_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String s = br.readLine();
        String abc = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < abc.length(); i++) {
            boolean find = false;
            for (int j = 0; j < s.length(); j++) {
                if (abc.charAt(i) == s.charAt(j)) {
                    find = true;
                    bw.write(j + " ");
                    break;
                }
            }
            if(find == false)
                bw.write(-1 + " ");
        }
        br.close();
        bw.close();
    }
}
