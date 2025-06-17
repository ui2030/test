package com.my.base;

public class EqualsTest {
    public static void main(String[] args) {
        test1(1);
        System.out.println();
        test2();                //이건 함수 호출
        System.out.println();
        test3();
    }

    static void test1(int i) { //void란 입출력이 비어있다는 뜻인데, 해석하면
        // test1이 입력, 출력이 비어있다는 뜻
        Object obj1 = new Object();
        Object obj2 = obj1;         // 객체 복사
        boolean result = obj1.equals(obj2);
        System.out.println(result);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
    static void test2() {
        String str = "홍길동";
        String str2 = "홍길동";
        System.out.println(str.equals(str2)); //괄호(())가 있으면 메서드(함수) 호출이다
        System.out.println(str == str2);
    }
    static void test3() {
        String str = new String("홍길동");
        String str2 = new String("홍길동");

        System.out.println(str.equals(str2));      // true. 값 비교
        System.out.println(str == str2);           // false. 주소 비교
    }
}
