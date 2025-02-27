package step.step_9;
import java.util.*;
import java.io.*;

public class p_1978 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st  = new StringTokenizer(br.readLine());
        int count = 0;
        for(int i = 0 ; i < n; i++){
            int a = Integer.parseInt(st.nextToken());
            if(isSosu(a)) count++;
        }

        bw.write(count + "");
        br.close();
        bw.close();
    }

    public static boolean isSosu(int a) {
        int count = 0;
        for(int i = 1; i <= a; i ++){
            if(a % i == 0) count++;
        }
        return count == 2;
    }
}
