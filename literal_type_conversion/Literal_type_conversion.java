package literal_type_conversion;

public class Literal_type_conversion {
    public static void main(String[] args) {

        literalTest();


    }

    public static void literalTest() {
//        byte bNum = 10;
//        int iNum = bNum;
//
//        int iNum1 = 20;
//        float fNum = iNum1;
//
//        int iNum2 = 10;
//        byte bNum2 = (byte)iNum;
//
//        double dNum = 3.14;
//        int iNum4 = (int)dNum;
//
//        System.out.println();

        double dNum = 1.2;
        float fNum = 0.9F;

        int iNum1 = (int) dNum + (int) fNum;
        int iNum2 = (int) (dNum + fNum);

        System.out.println(iNum1);
        System.out.println(iNum2);
    }
}
