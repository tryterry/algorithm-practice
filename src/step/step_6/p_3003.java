package step.step_6;
import java.util.*;
import java.io.*;

/**
 * 문제 이름: 킹, 퀸, 룩, 비숍, 나이트, 폰
 */
public class p_3003 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = {1, 1, 2, 2, 2, 8};

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr.length; i++){
            int a = Integer.parseInt(st.nextToken()); // 입력 받은 갯수들
            int need = arr[i] - a;
            bw.write(need + " ");
        }

        br.close();
        bw.close();
    }
}
