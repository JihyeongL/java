package inferenceTypeTest;

public class InferenceTypeTest {
    public static void main(String[] args) {
        var i = 10;  //int
        var j = 10.0;  //double
        var str = "hello";  //string

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test";
        //str = 3;  이미 선언된 data type이 string 이기 때문에 int를 사용못함

    }
}
