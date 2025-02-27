package step.step_5;

import java.io.*;
import java.util.*;

public class p_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = 20;
        float total = 0f;
        float totalHak = 0f;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            float score = Float.parseFloat(st.nextToken());
            float degree = getDegree(st.nextToken());

            if(degree != -1) {
                total += (score * degree);
                totalHak += score;
            }
        }

        float average = total / totalHak;

        bw.write(average + "");
        br.close();
        bw.close();
    }

    public static float getDegree(String s){
        float a;
        switch(s){
            case "A+": a = 4.5f; break;
            case "A0": a = 4.0f; break;
            case "B+": a = 3.5f; break;
            case "B0": a = 3.0f; break;
            case "C+": a = 2.5f; break;
            case "C0": a = 2.0f; break;
            case "D+": a = 1.5f; break;
            case "D0": a = 1.0f; break;
            case "F": a = 0.0f; break;
            default: a = -1f; break;
        }
        return a;
    }
}
