package step.step_8;

import java.util.*;
import java.io.*;

public class p_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int day = (v - b) / (a - b);
        if ((v - b) % (a - b) > 0) {
            day++;
        }
        bw.write(day + "");


        br.close();
        bw.close();
    }
}
