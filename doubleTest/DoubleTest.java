package doubleTest;

public class DoubleTest {
    public static void main(String[] args) {
        double dnum = 3.14;
//        float fnum = 3.14;  크기로 인해 에러 발생
        float fnum = 3.14f; //식별자 사용

        System.out.println(dnum);
        System.out.println(fnum);


        double tnum = 1;

        for(int i = 0; i<10000; i++) {
            tnum = tnum + 0.1;
        }
        System.out.println(tnum);
        //출력값 : 1001.000000000159
        //지수와 가수로 나타내는 부동 소수점 방식에서는
        // 지수부가 0을 표현할 수 없기 때문에 약간의 오차가 발생(오차값 : 0.000000000159)
    }
}
