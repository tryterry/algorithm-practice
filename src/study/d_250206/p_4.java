package study.d_250206;

import java.util.*;
import java.io.*;

public class p_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }

        bw.write(max + " " + min);
        bw.close();
        br.close();

    }
}
