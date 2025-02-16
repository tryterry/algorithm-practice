package step.step_6;

import java.io.*;
import java.util.*;

public class p_1157 {

    public static String distinct(String s) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            if(s.indexOf(s.charAt(i)) == i) answer += s.charAt(i);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // MISSISSIPI = [M,I,S,S,I,S,S,I,P,I]
        String s = br.readLine().toUpperCase(); // 모두 대문자로 변환
        char[] arr = s.toCharArray(); // char 배열로 변환
        char[] set = distinct(s).toCharArray();


        int max = 0;
        char best = '?';
        for(int i = 0; i < set.length;i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(set[i] == arr[j]) count++;
            }
            if(max < count) {
                max = count;
                best = set[i];
            }else if(max == count){
                best = '?';
            }
        }

        bw.write(String.valueOf(best));
        br.close();
        bw.close();
    }
}
