package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        //Java의 변수

        int T;

        String name = "Me";
        int hour = 5;

        double review = 4.5;
        char grade ='P';
        double mean = 0.0;
        boolean IsFail = false;

        System.out.println(name + "님, 배송이 시작됩니다."+hour+"시에 배송이 시작될 예정 입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        //형변환
        // 작은거 -> 큰거
        int intValue;
        byte byteValue = 10;
        char charValue = 'A';

        intValue = byteValue;
        System.out.println("byte to Int: "+intValue);

        intValue = charValue;
        System.out.println("Char to Int:"+ intValue);

        //큰거 -> 작은거

        double PI = 3.141592;
        intValue = (int)PI;
        System.out.println("Double to Int: "+intValue);

        intValue = 215242323;
        short shortValue = (short)intValue;
        System.out.println("Int to Short: "+shortValue);

        short a = 5;
        short b = 10;
        //short c = a+b; // int

        int t1 = 5;
        double t2 = 10.001;

    }
}
