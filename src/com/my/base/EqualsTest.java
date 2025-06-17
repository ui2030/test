package com.my.base;

public class EqualsTest {
    public static void main(String[] args) {
        test1();
        System.out.println();
        test2();
        System.out.println();
        test3();
    }

    static void test1() {
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
        System.out.println(str.equals(str2));
        System.out.println(str == str2);
    }
    static void test3() {
        String str = new String("홍길동");
        String str2 = new String("홍길동");

        System.out.println(str.equals(str2));      // true. 값 비교
        System.out.println(str == str2);           // false. 주소 비교
    }
}
