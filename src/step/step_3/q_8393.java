package step.step_3;
import java.util.*;
import java.io.*;

/**
 * 문제 번호: 8393
 * 문제 이름: 합
 */
public class q_8393 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //given
        int n = Integer.parseInt(br.readLine());

        //when
        int r = 0;
        for(int i = 1; i <= n; i++){
            r += i;
        }
        //then
        bw.write(String.valueOf(r));


        br.close();
        bw.close();
    }
}
