package step.step_5;
import java.util.*;
import java.io.*;

public class p_11718 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = "";
        while ( (s = br.readLine()) != null) {
            bw.write(s+"\n");
        }
        br.close();
        bw.close();
    }
}