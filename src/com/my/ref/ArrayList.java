package com.my.ref;

import java.util.List;

//*List - 배열과 반대로 데이터 추가/삭제가 빠르다. 검색이 늦다. 포인터로 연결 구조
/* ArrayList, LinkedList- */
public class ArrayList {
    public static void main(String[] args) {
        List<String> arrayList = new java.util.ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("D");
        System.out.println(arrayList);

        arrayList.add(2,"c");
        System.out.println(arrayList);
    }
}
