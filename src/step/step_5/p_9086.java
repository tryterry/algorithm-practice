package step.step_5;

import java.io.*;
import java.util.*;

public class p_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            arr[i] = s.charAt(0) + "" + s.charAt(s.length() - 1);
        }

        for (int i = 0; i < n; i++) {
            bw.write(arr[i]);
            bw.newLine();
        }

        br.close();
        bw.close();

    }
}
