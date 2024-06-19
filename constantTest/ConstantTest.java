package constantTest;

public class ConstantTest {
    public static void main(String[] args) {
        final int MAX_NUM = 100;  //주로 대문자로 사용
        final int MIN_NUM;
        // 상수를 사용하기 전에는 값 대입 필요 하지만, 한번 대입된 값은 변할수 없음
        MIN_NUM = 0;

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

        //MAX_NUM = 1000;

    }
}
