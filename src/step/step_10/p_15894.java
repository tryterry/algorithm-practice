package step.step_10;

import java.util.*;
import java.io.*;

public class p_15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Integer.parseInt(br.readLine());

        long top = 0;
        long side = 0;
        for (int i = 0; i < n; i++) {
            top++;
            side += 2;
        }

        bw.write((top * 2 + side) + "");
        br.close();
        bw.close();
    }

}
