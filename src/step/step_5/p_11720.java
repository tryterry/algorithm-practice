package step.step_5;

import java.util.*;
import java.io.*;

/**
 * 문제 이름: 숫자의 합
 * Character.getNumericValue(char) : char 형을 int 값으로 변환
 */
public class p_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String s = br.readLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int a = Character.getNumericValue(s.charAt(i));
            sum += a;
        }
        bw.write(sum + "");
        br.close();
        bw.close();
    }
}
