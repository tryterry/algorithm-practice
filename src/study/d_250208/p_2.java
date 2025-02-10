package study.d_250208;

import java.util.*;
import java.io.*;

public class p_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n, k;
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int sum = 0;
        int temp; // 이전 값을 저장하는 temp
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            temp = sum;
            sum += a;

            if (sum == k) {
                bw.write(sum + "");
                break;
            }

            if (sum > k) {
                if (sum - k > k - temp) bw.write(temp + "");
                else if (sum - k < k - temp) bw.write(sum + "");
                else {
                    if (sum > temp) bw.write(sum + "");
                    else bw.write(temp + "");
                }
                break;
            }
        }
        br.close();
        bw.close();

    }
}
