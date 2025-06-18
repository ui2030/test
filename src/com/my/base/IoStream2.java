package com.my.base;

import java.util.Scanner;

public class IoStream2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //스캐너 객체 생성
        System.out.println("입력: ");
        byte b = sc.nextByte();
        short s = sc.nextShort();
        int i = sc.nextInt();
        double d = sc.nextDouble();
        char c = sc.next().charAt(0);   //charAt는 문자열 인덱스 0번째에 넣는다는 뜻

        String str = sc.next(); //공백을 기준으로 읽어온다.
        String str2 = sc.nextLine();    // 개행(줄 바꾸기)을 기준으로 읽어온다.

        sc.close(); // 명시적으로 입력스트림을 닫는다.
                    // 알아서 닫아주지만, 열어두면 공간 낭비가 된다.


    }
}
