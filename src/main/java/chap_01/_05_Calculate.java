package chap_01;

public class _05_Calculate {
    public static void main(String[] args) {

        int pizza = 1;
        double pieceOfPizza = 0.1;
        double result=pizza;

        for(int i=0;i<3;i++){
            result = result - pieceOfPizza;
        }

        System.out.println(result);

        int intPizza = pizza*10;
        int intPizzaUnit = 1;

        int intResult = intPizza;
        for(int i=0;i<3;i++){
            intResult = intResult - intPizzaUnit;
        }

        System.out.println(intResult/10.0);

        //NaN,Infinity

        int num1 = 5;
        int intZero =0;
        double zero = 0.0;

        double InfExample = num1/zero;
        double NanExample = num1%zero;
        double zeroZero = 0.0/0.0;

        if(Double.isInfinite(InfExample) || Double.isNaN(NanExample)){
            System.out.println(InfExample);
            System.out.println("산술연산이 불가능합니다. 무한대거나 NaN입니다.");
        }

        //OverFlow

        int x = 1000000;
        int y = 1000000;
        int z = x*y;
        System.out.println(z);
        //

    }
}
