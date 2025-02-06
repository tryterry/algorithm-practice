package step.step_4;

import java.io.*;
import java.util.*;

/**
 * 문제 번호: 10807
 * 문제 이름: 개수 세기
 */
public class p_10807 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[100];

        Arrays.fill(arr, -999); // arr 배열의 모든 원소를 -999로 초기화

        StringTokenizer st = new StringTokenizer(br.readLine());

        int i = 0;
        while (st.hasMoreTokens()) {
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        int target = Integer.parseInt(br.readLine());

        int result = 0;
        for(int j = 0; j < i; j++){
            if(arr[j] == target) result++;
        }

        bw.write(String.valueOf(result));

        bw.close();
        br.close();
    }

}
