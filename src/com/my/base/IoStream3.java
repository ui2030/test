package com.my.base;

import java.util.Scanner;

public class IoStream3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자: ");
        int age = sc.nextInt();         //버퍼에 엔터키가 남아있다.
        sc.nextLine();                  //버퍼에 남아있는 엔터키를 뺀다.
        System.out.print("이름: ");
        String name = sc.nextLine();    // 이전에 엔터키를 가져온다.

        System.out.println("num: " + age);
        System.out.println("이름: " + name);

        sc.close();
    }
}
