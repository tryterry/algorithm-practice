package step.step_2;

import java.util.*;
import java.io.*;

/**
 * 문제 번호: 1330
 * 문제 이름: 두 수 비교하기
 */

public class q_1330 {
    public static void main(String[] args) throws IOException {
        int a, b;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        //given
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        //when
        String r;
        if(a > b){
            r = ">";
        }else if(a < b){
            r = "<";
        }else{
            r = "==";
        }
        //then
        bw.write(r);

        br.close();
        bw.close();

    }
}
