package com.my.base;

public class TypeTest5 {
    public static void main(String[] args) {
        String str = "let's learn Java";    // heap 영역의 string constrant pool
        String str2 = "let's learn Java";
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str2));
        System.out.println();

        String str3 =  new String("let's learn Java");  // heap 영역에 저장
        String str4 =  new String("let's learn Java");
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
    }
}
