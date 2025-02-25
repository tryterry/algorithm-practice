package step.step_8;

import java.io.*;
import java.util.*;

public class p_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 6.. 12 .. 18.. 24

        int step = 1;
        int min = 1;
        int max = 1;
        int i = 1; // 증가값

        int n = Integer.parseInt(br.readLine());
        while (!(n >= min && n <= max)) {
            if(i == 1){
                min += 1;
            }else{
                min += (i - 1) * 6;
            }
            max += i * 6;
            step++;
            i++;
        }

        bw.write(step + "");
        br.close();
        bw.close();

    }
}
