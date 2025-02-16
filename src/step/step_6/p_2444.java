package step.step_6;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 별 찍기
 * <p>
 * *
 * ***
 * *****
 * *******
 * *********
 * *******
 * *****
 * ***
 * *
 */
public class p_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) bw.write(" ");
            for (int j = 0; j < 2 * i + 1; j++) bw.write("*");
            bw.newLine();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < i + 1; j++) bw.write(" ");
            for (int j = 0; j < 2 * (n - 1 - i) - 1; j++) bw.write("*");
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
