package step.step_2;
import java.io.*;
import java.util.*;

/**
 * 문제 번호: 9498
 * 문제 이름: 시험 성적
 */
public class q_9498 {
    public static void main(String[] args) throws IOException{
        int a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //given
        a = Integer.parseInt(br.readLine());

        //when
        String r;
        if(a>=90 && a<=100){
            r = "A";
        }else if(a>=80 && a <= 89){
            r = "B";
        }else if(a>=70 && a <= 79){
            r = "C";
        }else if(a>=60 && a <= 69){
            r = "D";
        }else{
            r = "F";
        }
        //then
        bw.write(r);

        br.close();
        bw.close();
    }
}
