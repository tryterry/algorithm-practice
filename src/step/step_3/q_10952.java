package step.step_3;
import java.util.*;
import java.io.*;

/**
 * 문제 번호: 10952
 * 문제 이름: A+B - 5
 */
public class q_10952 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a,b;

        ArrayList<Integer> list = new ArrayList<>();
        //given
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if(a==0 && b== 0)
                break;

            list.add(a + b);
        }
        //when
        for(int i = 0; i< list.size(); i++){
            bw.write(String.valueOf(list.get(i)));
            bw.newLine();
        }

        //then
        br.close();
        bw.close();
    }
}
