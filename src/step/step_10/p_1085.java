package step.step_10;
import java.io.*;
import java.util.*;

public class p_1085 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int min = x;  // x ~ 0 거리

        if(w - x < min) min = w - x;
        if(y < min) min = y;
        if(h - y < min) min = h - y;

        bw.write(min + "");

        br.close();
        bw.close();
    }
}
