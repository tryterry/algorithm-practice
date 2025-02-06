package step.step_4;
import java.util.*;
import java.io.*;

/**
 * 문제 번호: 3052
 * 문제 이름: 나머지
 */
public class p_3052 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //given
        int size = 10;
        int a;
        int b = 42;
        int arr[] = new int[size];


        //when
        for(int i = 0; i < size; i++){
            a = Integer.parseInt(br.readLine());
            arr[i] = a % b;
        }

        int newArr[] = Arrays.stream(arr).distinct().toArray();

        //then

        bw.write(String.valueOf(newArr.length));


        br.close();
        bw.close();
    }
}
