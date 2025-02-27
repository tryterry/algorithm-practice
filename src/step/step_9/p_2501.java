package step.step_9;
import java.util.*;
import java.io.*;

public class p_2501 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int num = 0;
        int target = 0;
        for(int i = 1; i <= n; i++){
            if(((n % i) == 0)) num++;
            if(num == k){
                target = i;
                break;
            }
        }

        bw.write(target + "");

        br.close();
        bw.close();
    }
}

