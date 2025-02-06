package step.step_4;

import java.util.*;
import java.io.*;

/**
 * 문제 번호: 10810
 * 문제 이름: 공 넣기
 */
public class p_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //given
        int n, m;

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 바구니 개수
        m = Integer.parseInt(st.nextToken()); // 공 넣는 횟수

        int arr[] = new int[n];

        //when
        int start, end, num;
        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st2.nextToken()) - 1; // 바구니 개수
            end = Integer.parseInt(st2.nextToken()); // 바구니 개수
            num = Integer.parseInt(st2.nextToken()); // 바구니 개수
            Arrays.fill(arr, start, end, num);
        }

        //then

        for(int i = 0; i < n; i++){
            bw.write(String.valueOf(arr[i] + " "));
        }


        br.close();
        bw.close();
    }
}
