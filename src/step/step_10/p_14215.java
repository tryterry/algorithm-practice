package step.step_10;

import java.util.*;
import java.io.*;

public class p_14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int maxIdx = 0;

        for (int i = 0; i < 3; i++) {
            if (arr[i] > arr[maxIdx]) maxIdx = i;
        }

        int max = arr[maxIdx];
        int remain = 0;
        for (int i = 0; i < 3; i++) {
            if (i != maxIdx) remain += arr[i];
        }

        int length;
        if (max < remain) length = max + remain;
        else length = remain * 2 - 1;

        bw.write(length + "");
        br.close();
        bw.close();
    }

}
