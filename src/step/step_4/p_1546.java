package step.step_4;

import java.util.*;
import java.io.*;

/**
 * 문제 번호: 1546
 * 문제 이름: 평균
 */
public class p_1546 {

    public static float getNewScore(int score, int max){
        return (float) score / max * 100;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //given
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //when
        // max 찾기
        int max = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] > max) max = arr[i];
        }

        // 새로운 점수 도출 및 합산
        float sum = 0;
        for(int i = 0; i < n; i++){
            sum += getNewScore(arr[i], max);
        }
        float result = sum / n;
        //then
        bw.write(String.valueOf(result));

        br.close();
        bw.close();

    }
}
