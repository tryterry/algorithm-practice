package study.d_250201;
import java.io.*;
import java.util.*;

/**
 * 두 번재 풀이
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 */
public class b_2444_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <=n; i ++){
            for (int j = 0; j < n - i; j++) bw.write(" ");
            for (int j = 1; j <= 2 * i - 1; j++) bw.write("*");
            bw.write("\n");
        }

        for(int i = n; i >= 1; i--){
            for (int j = 0; j < n - i; j++) bw.write(" ");
            for (int j = 1; j <= 2 * i - 1; j++) bw.write("*");
            bw.write("\n");
        }

        br.close();
        bw.close();
    }
}
