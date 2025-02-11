package step.step_5;
import java.util.*;
import java.io.*;

/**
 * 문제 이름: 상수
 */
public class p_2908 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String first = st.nextToken();
        String second = st.nextToken();

        int rFirst = getReverseNumber(first);
        int rSecond = getReverseNumber(second);

        if(rFirst > rSecond) bw.write(rFirst + "");
        else bw.write(rSecond + "");
        br.close();
        bw.close();
    }

    public static int getReverseNumber(String s){
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return Integer.parseInt(reverse);
    }
}
