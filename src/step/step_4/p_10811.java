package step.step_4;

import java.util.*;
import java.io.*;

/**
 * 문제 번호: 10811
 * 문제 이름: 바구니 뒤집기
 */
public class p_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //given
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n, m;

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int arr[] = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        //when
        int start, end, length;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            length = end - start;
            int k = 0;
            // 역순으로 바꾸기
            for (int j = start; j <= end; j++) {
                if (k > (length / 2)) break;
                int temp = arr[start + k];
                arr[start + k] = arr[end - k];
                arr[end - k] = temp;
                k++;
            }
        }

        //then

        for (int i = 1; i <= n; i++) {
            bw.write(String.valueOf(arr[i] + " "));
        }


        br.close();
        bw.close();
    }
}
