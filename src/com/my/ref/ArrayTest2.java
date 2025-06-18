package com.my.ref;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] nums = null;
        nums = new int[] {10, 20, 30, 40};
        int sum = 0;        // 누적하는 변수는 초기화가 필요하다.
        //int num;
        //num = 10;

        for(int n : nums) {
            sum += n;
        }
        System.out.println("총합: " + sum);
        //int add(nums);
    }
    // add 메서드
    public  static int add(int[] ary) { // 매개변수 배열
        int res = 0;
        for(int n : ary) {
            res += n + 1;
        }
        return res;
    }
}
