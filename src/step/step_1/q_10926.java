package step.step_1;

import java.util.*;
import java.io.*;

/**
 * 문제 번호: 10926
 * 문제 이름: ??!
 */
public class q_10926 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String st = br.readLine();
        bw.write(String.valueOf(st + "??!"));
        br.close();
        bw.close();
    }
}
