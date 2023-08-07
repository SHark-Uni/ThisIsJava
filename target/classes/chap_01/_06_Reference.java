public class _06_Reference {
    public static void main(String[] args) {
        // String,Array는 참조값이다.
        // String은 리터럴로 초기화 할 시, 같은 값이면 같은 주소를 가리키게 된다.

        String strVar1 = "샤크";
        String strVar2 = "샤크";

        if(strVar1==strVar2){
            System.out.println("이 둘은 같은 곳을 가리키고 있습니다.");
        }else{
            System.out.println(" strvar1과 strvar2는 참조가 다릅니다.");
        }

    }
}
