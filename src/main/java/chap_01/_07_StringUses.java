package chap_01;

public class _07_StringUses {
    public static void main(String[] args) {
        String[] privateNumber1 = {"9901011234567","9901012234567","9901013234567","9901014234567"};

        //charAt, length 문자열의 길이와 charAt
        for(int i=0;i<privateNumber1.length;i++){
            char pivot = privateNumber1[i].charAt(6);
            if(IsMale(pivot)){
                System.out.println(i+"번째 분은"+" 남성입니다");
                continue;
            }
            System.out.println(i+"번째 분은"+" 여성입니다");
        }
        //문자열의 대체

        String strVar = "JS는 짱입니다.";
        String rpStrVar=strVar.replace("JS","Java");

        System.out.println("원래 값: "+strVar);
        System.out.println("바뀐 값: "+rpStrVar);

        //둘은 같은 객체를 가리키고 있는 것일까? 아니면, 새롭게 객체를 만들어서 리턴을 한 값일까?

        if(strVar == rpStrVar){
            System.out.println("strVar,rpStrVar 둘은 같은 객체를 참조하고 있습니다.");
        }else{
            System.out.println("strVar,rpStrVar 둘은 다른 메모리 주소를 가지는 객체입니다.");
        }
    }
    public static boolean IsMale(char genderNumber){
        if(genderNumber=='1' || genderNumber=='3'){
            return true;
        }
        return false;
    }
}
