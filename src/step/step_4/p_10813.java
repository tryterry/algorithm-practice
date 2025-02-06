package step.step_4;

import java.util.*;
import java.io.*;

/**
 * 문제 번호: 10813
 * 문제 이름: 공 바꾸기
 */
public class p_10813 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //given
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int arr[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        int a, b;
        //when
        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st2.nextToken());
            b = Integer.parseInt(st2.nextToken());
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        //then

        for (int i = 1; i <= n; i++) {
            bw.write(String.valueOf(arr[i] + " "));
        }

        br.close();
        bw.close();
    }
}
