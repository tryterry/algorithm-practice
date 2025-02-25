package step.step_8;

import java.io.*;
import java.util.*;


public class p_1193 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int child = 1;
        int parent = 1;

        // 분자, 분모 증가 방향
        // false: 분자 증가, 분모 감소
        // true: 분자 감소, 분모 증가

        int x = Integer.parseInt(br.readLine());
        int count = 0;
        int n = 1;
        while (count != x) {
            if (n == 1) count++;
            else {
                if (n % 2 == 0) {// 짝
                    child = 1;
                    parent = n;
                } else { // 홀
                    child = n;
                    parent = 1;
                }
                for (int i = 0; i < n; i++) {
                    count++;
                    if (count == x) break;
                    if (n % 2 == 0) { // 짝수
                        child++;
                        parent--;
                    } else { // 홀수
                        child--;
                        parent++;
                    }
                }
            }
            n++;
        }

        bw.write(child + "/" + parent);

        br.close();
        bw.close();
    }
}
