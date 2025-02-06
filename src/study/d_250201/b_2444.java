package study.d_250201;
import java.io.*;
import java.util.*;

/**
 * 첫 번째 풀이
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

public class b_2444 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //given
        int n = Integer.parseInt(br.readLine());
        int x = 2 * n - 1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < x; j++){
                if((j >= x/2 -i) && (j <= x/2 +i))
                    bw.write("*");
                else
                    bw.write(" ");
            }
            bw.newLine();
        }

        for(int i = n-2; i >= 0; i--){
            for(int j = 0; j < x; j++){
                if((j >= x/2 -i) && (j <= x/2 +i))
                    bw.write("*");
                else
                    bw.write(" ");
            }
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
