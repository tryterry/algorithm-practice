package step.step_3;
import java.util.*;
import java.io.*;

/**
 * 문제 번호: 15552
 * 문제 이름: 빠른 A+B
 */
public class q_15552 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //given
        int a,b;
        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[t];

        //when
        for(int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            arr[i] = a + b;
        }

        //then
        for(int i = 0; i <t; i++){
            bw.write(String.valueOf(arr[i]));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
