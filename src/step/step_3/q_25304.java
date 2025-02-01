package step.step_3;
import java.util.*;
import java.io.*;

/**
 * 문제 번호: 25304
 * 문제 이름: 영수증
 */
public class q_25304 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // given
        int x,n,a,b;
        x = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());

        int total = 0;
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            total += (a * b);
        }

        //when
        String r;
        if(total == x) r = "Yes";
        else r = "No";

        //then
        bw.write(String.valueOf(r));

        br.close();
        bw.close();
    }
}
