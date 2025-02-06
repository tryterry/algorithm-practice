package step.step_4;
import java.util.*;
import java.io.*;

/**
 * 문제 번호: 2562
 * 문제 이름: 최댓
 */
public class p_2562 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //given
        int n = 9;
        int arr[] = new int[9];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        //when
        // 최댓값 찾기
        int index = 0;
        int max = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }

        //then

        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf(index+1));


        br.close();
        bw.close();
    }
}
