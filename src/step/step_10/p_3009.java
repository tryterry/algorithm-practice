package step.step_10;

import java.util.*;
import java.io.*;

public class p_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        int[] x = new int[2];
        int[] y = new int[2];
        String[] s = new String[3];
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        s[0] = line;
        x[0] = Integer.parseInt(st.nextToken());
        y[0] = Integer.parseInt(st.nextToken());

        for(int i = 1; i < 3; i ++){
            String line2 = br.readLine();
            st = new StringTokenizer(line2);
            int xx = Integer.parseInt(st.nextToken());
            int yy = Integer.parseInt(st.nextToken());
            s[i] = line2;
            if(x[0] != xx) x[1] = xx;
            if(y[0] != yy) y[1] = yy;
        }


        for (int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++){
                String spot = x[i] + " " + y[j];
                if(!Arrays.asList(s).contains(spot)){
                    bw.write(spot);
                }
            }
        }

        bw.close();
        br.close();
    }
}
