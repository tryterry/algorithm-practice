package step.step_1;
import java.util.*;
import java.io.*;

/**
 * 문제 번호: 10171
 * 문제 이름: 고양이
 *
 * \    /\
 *  )  ( ')
 * (  /  )
 *  \(__)|
 */
public class q_10171 {


    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("\\    /\\");
        bw.newLine();
        bw.write(" )  ( ')");
        bw.newLine();
        bw.write("(  /  )");
        bw.newLine();
        bw.write(" \\(__)|");

        bw.close();
    }
}
