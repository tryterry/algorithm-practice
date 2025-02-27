package step.step_9;

import java.util.*;
import java.io.*;

public class p_5086 {
    public static String factor = "factor";
    public static String multiple = "multiple";
    public static String neither = "neither";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<String> list = new ArrayList<>();


        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0) break; // 0 0 이면 중지

            if (b % a == 0) list.add(factor);
            else if (a % b == 0) list.add(multiple);
            else list.add(neither);
        }

        bw.write(String.join("\n", list));
        br.close();
        bw.close();
    }
}
