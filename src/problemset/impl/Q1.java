package problemset.impl;

import java.util.*;
import java.io.*;

/**
 * 2675
 */
public class Q1 {

    static int T, R;
    static String S;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        T = Integer.parseInt(st.nextToken());

        ArrayList<String> list = new ArrayList<>();

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            R = Integer.parseInt(st.nextToken());
            S = st.nextToken();

            char[] arr = new char[R * S.length()];

            int idx = 0;
            for (int i = 0; i < S.length(); i++) {
                for (int j = 0; j < R; j++) {
                    arr[idx] = S.charAt(i);
                    idx++;
                }
            }
            list.add(new String(arr));
        }
        for(int i = 0; i < list.size(); i++){
            bw.write(list.get(i));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
