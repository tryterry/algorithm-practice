package step.step_8;

import java.util.*;
import java.io.*;

public class p_2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int a = 3;

        for(int i = 1; i <n; i++){
            a += (a - 1);
        }

        bw.write(a*a + "");

        br.close();
        bw.close();
    }
}

