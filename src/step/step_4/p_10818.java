package step.step_4;

import java.util.*;
import java.io.*;

/**
 * 문제 번호: 10818
 * 문제 이름: 최소, 최대
 */
public class p_10818 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //given
        int n = Integer.parseInt(br.readLine()); // 정수 개수 입력
        int arr[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine()); // 수열 읿력

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //when

        int min = 10000000;
        int max = -10000000;

        for(int i = 0; i < n; i++){
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }

        //then
        bw.write(String.valueOf(min + " " + max));

        br.close();
        bw.close();
    }
}
