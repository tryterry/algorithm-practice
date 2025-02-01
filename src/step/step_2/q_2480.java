package step.step_2;
import java.util.*;
import java.io.*;

/**
 * 문제 번호: 2480
 * 문제 이름: 주사위 세개
 */
public class q_2480 {
    public static void main(String[] args) throws IOException{
        int a,b,c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        //given
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        //when
        int r;
        if(a == b && b == c){
            r = 10000 + a * 1000;
        }else if(a != b && b != c && a != c){
            r = max(a,b,c) * 100;
        }else{
            r = 1000 + getDouble(a,b,c) * 100;
        }

        //then
        bw.write(r + "");

        br.close();
        bw.close();
    }

    public static int max(int a, int b, int c) {
        int max = 0;
        if(max < a) max = a;
        if(max < b) max = b;
        if(max < c) max = c;
        return max;
    }

    public static int getDouble(int a, int b, int c){
        int r;
        if(a == b){
            r = a;
        }else if(b == c){
            r = b;
        }else if(c == a){
            r = c;
        }else{
            r = 0;
        }
        return r;
    }
}
