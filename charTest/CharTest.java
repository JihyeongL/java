package charTest;

public class CharTest {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1); //강제 형변환

        char ch2 = 66;
        System.out.println(ch2); // 문자로 출력됨
        System.out.println((char) ch2);

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char) ch3); //문자로 출력됨

//        char ch = -66; 에러 발생; 음수는 사용할수 없음

//        char ch = 234455; 2byte 이상 이기 때문에 에러 발생

    }
}
