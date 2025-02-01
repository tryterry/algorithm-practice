package step.step_3;
import java.io.*;
import java.util.*;
/**
 * 문제 번호: 2438
 * 문제 이름: 별찍기 - 1
 */
public class q_2438 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //given
        int n = Integer.parseInt(br.readLine());

        //when

        //then
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                bw.write("*");
            }
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
