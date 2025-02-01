package step.step_3;

import java.util.*;
import java.io.*;

/**
 * 문제 번호: 2439
 * 문제 이름: 별찍기 - 2
 */
public class q_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        //given
        int n = Integer.parseInt(br.readLine());
        //when

        //then
        for (int i = 1; i <= n; i++) {
            String stars = "";
            for(int j = 0; j < i; j++){
                stars += "*";
            }
            String space = "%" + n + "s";
            bw.write(String.format(space, stars));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
