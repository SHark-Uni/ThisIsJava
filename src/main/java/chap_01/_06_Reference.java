package chap_01;

public class _06_Reference {
    public static void main(String[] args) {
        // String,Array는 참조값이다.
        // String은 리터럴로 초기화 할 시, 같은 값이면 같은 주소를 가리키게 된다.

        String strVar1 = "샤크";
        String strVar2 = "샤크";

        if(strVar1==strVar2){
            System.out.println("strVar1과 strVar2은 같은 메모리 주소를 가리키고 있습니다.");
        }else{
            System.out.println("strVar1과 strVar2는 참조가 다릅니다.");
        }
        //NullPointer Exception

//        int[] arr={1,2,3,4,5};
//        arr= null;
//        System.out.println(arr[0]);

        //new 키워드로 새롭게 생성할 시, 다른 메모리 공간을 잡아준다.

        String strVar3 = new String("샤크");
        String strVar4 = new String("샤크");

        if(strVar3==strVar4){
            System.out.println("이 둘은 같은 메모리 주소를 가리키고 있습니다.");
        }else{
            System.out.println("strVar3과 strVar4는 참조가 다릅니다.");
        }

        // 따라서, 단순히 값만 비교할 때는 equals를 쓰도록하자.
        if(strVar3.equals(strVar4)){
            System.out.println("문자열이 같습니다.");
        }
    }
}
