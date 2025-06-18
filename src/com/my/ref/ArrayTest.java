package com.my.ref;

import javax.swing.text.Style;

/* 배열, 열거, 클래스, 인터페이스 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};                //배열객체 선언과 초기화
        //int arr1[] =  {10, 20, 30};
        int[] arr2 = new int[]{11, 22, 33, 44, 55}; //명시적 배열 선언

        int[] arr3 = null; //아무값을 갖지않고 있는 참조 변수. //동적으로 배열 생성
        // 동적* : 나중에 내가 사용하려고 만든것
        arr3 = new int[]{12, 13, 14};   // <== 사용하면 안댐

        int[] arr4 = new int[4];

        for(int i = 0; i < 5; i++) {
            System.out.printf("%d", arr[i]);
        }
        // 문자열 배열 동적할당
        String[] strAry = new String[3];
        strAry[0] = "Java";
        strAry[1] = "Java";
        strAry[2] = new String("Java");

        System.out.println(strAry[0] == strAry[1]);
        System.out.println(strAry[1] == strAry[2]);
        System.out.println(strAry[1].equals((strAry[2])));

        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(arr3);

        for(int i = 0; i < strAry.length; i++) {    //length 배열길이 반환.
            System.out.println(strAry[i]);
        }
        System.out.println();
        for(String s: strAry) { // 인덱스 접근이 불가. forEach문
            //배열 하나씩 꺼내서 s에 집어넣어라
            System.out.println(s);
        }
    }
}
