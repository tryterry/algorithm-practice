package step.step_5;
import java.io.*;
import java.util.*;

/**
 * 문제 이름: 단어 길이 재기
 * 컴파일 에러..?
 */
public class p_2743 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        bw.write(s.length()+" ");

        br.close();
        bw.close();
    }
}
