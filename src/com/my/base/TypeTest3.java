package com.my.base;

public class TypeTest3 {
    public static void main(String[] args) { //[변환 과정]
        int val = Integer.parseInt("100");  // 문자열 -> 정수
        double val2 = Double.parseDouble("3.14");   // 문자열 -> 실수
        System.out.println(val);
        System.out.println(val2);

                                            //[반대 변환 과정]
        String str = String.valueOf(100);   // 숫자 -> 문자열
        String str2 = String.valueOf(3.14); // 실수 -> 문자열
        System.out.println(str);
        System.out.println(str2);
    }
}
