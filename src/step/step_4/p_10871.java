package step.step_4;

import java.util.*;
import java.io.*;

/**
 * 문제 번호: 10871
 * 문제 이름: x보다 작은 수
 */
public class p_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // given
        int n, x;

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 정수 개수
        x = Integer.parseInt(st.nextToken()); // 기준 값
        int arr[] = new int[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine()); // 정수 입력

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        //when

        for(int i = 0; i < n; i++){
            if(arr[i] < x) bw.write(String.valueOf(arr[i] + " "));
        }
        //then

        br.close();
        bw.close();
    }
}
