package step.step_5;
import java.util.*;
import java.io.*;

/**
 * 문제 이름: 단어의 개수
 */

public class p_1152 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        while (st.hasMoreTokens()) {
            st.nextToken();
            count++;
        }

        bw.write(count + "");

        br.close();
        bw.close();
    }
}
