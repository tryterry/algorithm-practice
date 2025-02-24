package step.step_7;

import java.io.*;
import java.util.*;

public class p_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 5;
        int m = 15;
        char[][] arr = new char[n][m];


        for (int i = 0; i < n; i++) {
            String st = br.readLine();
            for (int j = 0; j < st.length(); j++) {
                arr[i][j] = st.charAt(j);
            }
        }

        char[][] d = arr;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (arr[i][j] != '\u0000')
                    bw.write(arr[i][j]);
            }
        }
        br.close();
        bw.close();
    }
}
