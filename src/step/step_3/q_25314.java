package step.step_3;
import java.util.*;
import java.io.*;


/**
 * 문제 번호: 25314
 * 문제 이름: 코딩은 체육과목입니다.
 */
public class q_25314 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //given
        int n = Integer.parseInt(br.readLine());

        //when
        int r = n/4;

        for(int i = 0; i < r; i ++){
            bw.write("long ");
        }
        bw.write("int");
        //then


        br.close();
        bw.close();
    }
}
