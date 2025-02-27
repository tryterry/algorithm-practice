package step.step_9;

import java.util.*;
import java.io.*;

public class p_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break; // -1 일 경우 중지

            String res = isWanjeon(n);
            bw.write(res);
            bw.newLine();
        }

        br.close();
        bw.close();
    }

    public static String isWanjeon(int n) {
        int[] arr = new int[n];
        for (int i = 1; i < n; i++) {
            if (n % i == 0) arr[i] = i; // 약수인 경우 배열에 추가
        }

        int sum = 0; // 모든 약수 더하기
        for (int i = 1; i < n; i++) {
            sum += arr[i];
        }
        if (sum == n) {
            return n + " = " + getString(arr);
        } else {
            return n + " is NOT perfect.";
        }
    }

    public static String getString(int[] arr){
        String st = "";
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                if(st == "") st += String.valueOf(arr[i]);
                else st += String.valueOf(" + " + arr[i]);
            }
        }
        return st;
    }
}
