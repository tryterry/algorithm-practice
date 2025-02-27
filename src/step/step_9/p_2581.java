package step.step_9;

import java.util.*;
import java.io.*;

public class p_2581 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];


        int sum = 0;
        int min = 0;
        int sosuNum = 0;
        for (int i = m; i <= n; i++) {
            if (isSosu(i)) {
                arr[i] = i; // 소수인 수 구하기
                min = arr[i];
                sosuNum++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // 소수의 합 구하기

            if (arr[i] != 0 && min > arr[i]) min = arr[i];
        }

        if (sosuNum > 0)
            bw.write(sum + "\n" + min);
        else
            bw.write(-1 + "");

        br.close();
        bw.close();
    }

    public static boolean isSosu(int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) count++;
        }
        return count == 2;
    }
}
