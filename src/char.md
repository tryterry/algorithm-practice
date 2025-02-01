# Java 알고리즘에서 사용하는 문자열 관련 API 정리

---

## 문자열의 특정 문자만 참조하기

String.charAt(int index)으로 문자열의 특정 index의 문자만 추출할 수 있다.

~~~ java
String text = "1234";
text.charAt(0); // '1'
text.charAt(1); // '2'
text.charAt(2); // '3'
text.charAt(3); // '4'
~~~
---
## char형 숫자(0~9) 문자를 정수로 변환

Character.getNumericValue(char c)으로 숫자형태의 문자를 정수로 변환할 수 있다.

~~~ java
char c = '7';
Character.getNumericValue(c); // 7
~~~
