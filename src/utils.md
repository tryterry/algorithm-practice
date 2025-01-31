# Java 알고리즘에서 사용하는 API 정리

## 1. BufferedReader

사용자 입력 관리 클래스

~~~ java
import java.io.*; // 라이브러리 import
~~~

~~~ java
public class Main {
    public static void main(String[] args)throws IOException { // 예외 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언 
        String str = br.readLine(); // 문자열 한 줄을 입력 받음
        int i = Integer.parseInt(br.readLine()); // 정수형으로 변환
    }
}
~~~

---

## 2. BufferedWriter

문자열 출력 클래스

~~~ java
import java.io.*; // 라이브러리 import
~~~

~~~ java
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
        bw.write("string 1 ");
        bw.newLine(); //개행 
        bw.write("string 2");
        bw.write("\n"); // 개행
        bw.close(); // bw 종료
    }
}
~~~

---

## 3. StringTokenizer

문자열 분리

1. 띄어쓰기 기준으로 문자열을 분리

~~~ java
StringTokenizer st = new StringTokenizer(???);
~~~

2. 구분자를 기준으로 문자열을 분리

~~~ java
StringTokenizer st = new StringTokenizer(???, ???);
~~~

3. 구분자를 기준으로 문자열을 분리할 분리

- 구분자도 토큰으로 넣는다. (true)
- 구분자를 분리된 문자열 토큰에 포함 시키지 않는다. (false)
- (디폴트 : false)

~~~ java
StringTokenizer st = new StringTokenizer(??? , ??? , true/false);
~~~
