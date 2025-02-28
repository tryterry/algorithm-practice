package step.step_10;

import java.util.*;
import java.io.*;

public class p_9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        int minX = x[0];
        int maxX = x[0];
        for(int i = 0; i <n; i++){
            if(x[i] < minX) minX = x[i];
            if(x[i] > maxX) maxX = x[i];
        }

        int minY = y[0];
        int maxY = y[0];
        for(int i = 0; i <n; i++){
            if(y[i] < minY) minY = y[i];
            if(y[i] > maxY) maxY = y[i];
        }

        int space = (maxX - minX) * (maxY - minY);
        bw.write(space + "");
        br.close();
        bw.close();
    }
}
