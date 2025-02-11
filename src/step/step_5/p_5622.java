package step.step_5;
import java.util.*;
import java.io.*;

/**
 * 문제 이름: 다이얼
 */
public class p_5622 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        String[] abc = {"***", "***", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

        int second = 0;
        for(int i = 0 ; i < s.length(); i++){
            for(int j = 0; j < abc.length; j++){
                if(abc[j].contains(Character.toString(s.charAt(i)))){
                    second += (j+1);
                    break;
                }
            }
        }


        bw.write(second + "");
        br.close();
        bw.close();
    }
}
