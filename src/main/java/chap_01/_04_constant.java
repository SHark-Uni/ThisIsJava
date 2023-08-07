package chap_01;

public class _04_constant {
        static int testVal=1; //static 변수
        int val=3; //인스턴스변수
        public static void testStatic(){ //static 메서드
            System.out.println("test");
        }
        public static void main(String[] args){
            //System.out.println(val); static 메서드안에서는 외부의 static 멤버에만 접근이 가능하다.
            System.out.println(testVal);
            System.out.println(Test.a);
            Test.print();
            testStatic();
            //////////////////////////////////////
            Test test1=new Test();
            System.out.println(test1.b);

            Test test2=new Test();
            System.out.println(test2.b);

            Test test3=new Test();
            System.out.println(test3.a);
            System.out.println(test3.b);
        }
    }
    ///////////////////////////////////////
    class Test{
        static int a=0;
        int b=0;

        Test(){
            a++;
            b++;
        }
        static void print(){
            System.out.println("static 메소드 입니다.");
        }
    }
