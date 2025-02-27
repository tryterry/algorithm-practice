package step.step_8;

import java.util.*;
import java.io.*;


public class p_2720 {
    public static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /**
         * 쿼터: 0.25
         * 다임: 0.10
         * 니켈: 0.05
         * 페니: 0.01
         */

        int n = Integer.parseInt(br.readLine());
        arr = new int[n][4];
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            getChange(i, a);
        }

        for(int i = 0; i < n;i++){
            for(int j = 0; j < 4; j++){
                bw.write(arr[i][j] + " ");
            }
            bw.newLine();
        }
        br.close();
        bw.close();
    }

    public static void getChange(int idx, int money) {
        int quoter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;

        arr[idx][0] = money / quoter;
        money %= quoter;


        arr[idx][1] = money / dime;
        money %= dime;


        arr[idx][2] = money / nickel;
        money %= nickel;

        arr[idx][3] = money / penny;
        money %= penny;
    }
}
