package step.step_4;

import java.util.*;
import java.io.*;

/**
 * 문제 번호: 5597
 * 문제 이름: 과제 안 내신 분..?
 */
public class p_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        //given
        int size = 30;
        int arr[] = new int[size + 1];
        int n;
        //when
        for (int i = 0; i < size - 2; i++) {
            n = Integer.parseInt(br.readLine());
            arr[n] = n;
        }

        //then
        for (int i = 1; i <= size; i++) {
            if (arr[i] != i) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }


        br.close();
        bw.close();
    }
}
