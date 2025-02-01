package step.step_1;
import java.util.*;
import java.io.*;

/**
 * 문제 번호: 10430
 * 문제 이름: 나머지
 */
public class q_10430 {

    public static void main(String[] args) throws IOException {
        int a, b, c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        // 첫째 줄: (A+B)%C
        bw.write(String.valueOf((a + b) % c));
        bw.newLine();
        // 둘째 줄: ((A%C) + (B%C))%C
        bw.write(String.valueOf(((a%c) + (b%c))%c));
        bw.newLine();
        // 셋째 줄: (A×B)%C
        bw.write(String.valueOf((a * b) % c));
        bw.newLine();
        // 넷째 줄: ((A%C) × (B%C))%C
        bw.write(String.valueOf(((a%c) * (b%c))%c));
        bw.newLine();

        br.close();
        bw.close();
    }
}
