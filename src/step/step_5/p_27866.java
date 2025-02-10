package step.step_5;
import java.util.*;
import java.io.*;

/**
 * 문제 이름: 문자와 문자열
 */
public class p_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int i = Integer.parseInt(br.readLine()) - 1;
        bw.write(s.charAt(i));
        br.close();
        bw.close();
    }
}
