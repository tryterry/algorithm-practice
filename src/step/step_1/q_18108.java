package step.step_1;
import java.util.*;
import java.io.*;

/**
 * 문제 번호: 18108
 * 문제 이름: 1998년생인 내가 태국에서는 2541년생?!
 */
public class q_18108 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(year - 543));

        br.close();
        bw.close();

    }
}
