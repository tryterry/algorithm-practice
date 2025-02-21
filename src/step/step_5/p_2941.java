package step.step_5;

import java.util.*;
import java.io.*;

/**
 * 크로아티아 알파벳
 */
public class p_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String input = br.readLine();

        int length = 0;
        int i = 0;
        while (i < input.length()) { // 입력 문자열 길이
            int temp = length; // 알파벳 길이 저장

            if (i <= input.length() - 2) {
                String two = input.substring(i, i + 2); // 두개의 문자열 검사
                for (int j = 0; j < alphabet.length; j++) {
                    if (alphabet[j].equals(two)) {
                        i += 2;
                        length += 1;
                    }
                }
            }

            if (i <= input.length() - 3 && temp == length) { // 세 개의 문자열 검사
                String three = input.substring(i, i + 3);
                for (int j = 0; j < alphabet.length; j++) {
                    if (alphabet[j].equals(three)) {
                        i += 3;
                        length += 1;
                    }
                }
            }
            if (temp == length) { // 해당 되는 알파벳이 없으면 1 증가
                i += 1;
                length += 1;
            }
        }

        bw.write(length + "");

        br.close();
        bw.close();
    }
}
