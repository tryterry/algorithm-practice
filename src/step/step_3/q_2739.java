package step.step_3;
import java.io.*;
import java.util.*;

/**
 * 문제 번호: 2739
 * 문제 이름: 구구단
 */
public class q_2739 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //given
        int n = Integer.parseInt(br.readLine());
        //when

        //then
        for(int i = 1; i <= 9; i++){
            bw.write(n + " * " + i + " = " + n * i);
            bw.newLine();
        }

        br.close();
        bw.close();

    }
}
