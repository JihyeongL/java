package binaryTest;

public class BinaryTest {

    public static void main(String[] args) {
        binary();
       variable();
    }

    public static void binary(){
        int num = 10;
        int bNum = 0B1010; // B -> byte 를 표시(4byte)
        int oNum = 012; // 0 -> 8진수 표시
        int xNum =0xA; // x -> 16 진수

        System.out.println("binary_practice");
        System.out.println(num);
        System.out.println(bNum);
        System.out.println(oNum);
        System.out.println(xNum+System.lineSeparator());
    }

    public static void variable(){
        int age, count;
        age = 10;

        int level = 10000;

        System.out.println("variable_practice");
        System.out.println(age);
        System.out.println(level);
    }
}
