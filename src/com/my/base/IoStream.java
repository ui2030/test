package com.my.base;

import java.util.Scanner;

public class IoStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //scanner 객체 생성
        System.out.println("비밀번호를 입력하시는데 동의하시나요? Y/N: ");
        String str = sc.nextLine();
        System.out.println(str);

        System.out.println("비밀번호 입력: ");
        String str2 = sc.nextLine();
        int n = Integer.parseInt(str2);  //문자열을 숫자로 변환

        System.out.printf("입력한 비밀번호는 %d 입니다.\n", n);
    }
}
