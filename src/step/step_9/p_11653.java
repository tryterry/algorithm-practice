package step.step_9;

import java.util.*;
import java.io.*;

public class p_11653 {

    public static ArrayList<Integer> sosu = new ArrayList<Integer>();

    public static void getSosu(int a) {
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) sosu.add(i);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        getSosu(n); // 소수 리스트 구하기

        int idx = 0;
        while (n > 1) {
            int s = sosu.get(idx);
            if (n % s == 0) {
                bw.write(s + "\n");
                n /= s;
            }else{
                idx++;
            }
        }
        br.close();
        bw.close();
    }
}
