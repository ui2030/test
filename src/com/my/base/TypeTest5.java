package com.my.base;

public class TypeTest5 {
    public static void main(String[] args) {
        String str = "let's learn Java";
        String str2 = "let's learn Java";


        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str2));
    }
}
