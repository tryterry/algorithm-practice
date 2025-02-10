package study.d_250208;

import java.util.*;
import java.io.*;

public class p_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        // max 값 찾기
        int max = arr[0];
        int max_i = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                max_i = i;
            }
        }

        // 다음 max 찾기
        int max2;
        if(max_i == 0) // 만약 가장 큰값이 첫번째면 다음 수부터 시작
            max2 = arr[1];
        else
            max2 = arr[0];

        for (int i = 0; i < n; i++) {
            if (i != max_i && arr[i] > max2) max2 = arr[i];
        }

        bw.write(max + " " + max2);

        br.close();
        bw.close();
    }
}
