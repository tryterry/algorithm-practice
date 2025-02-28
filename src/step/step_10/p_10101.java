package step.step_10;

import java.util.*;
import java.io.*;


public class p_10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if ((a + b + c) != 180) bw.write("Error");
        else if (a == b && b == c && c == a) bw.write("Equilateral");
        else if (a != b && b != c && c != a) bw.write("Scalene");
        else bw.write("Isosceles");

        br.close();
        bw.close();
    }
}
