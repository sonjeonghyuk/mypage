package week02;

import java.util.Scanner;

public class W17 {
    public static void main(String[] args) {
        //구구단 만들기
//        for(int i=2; i<=9; i++) {
//            for(int j=1; j<=9; j++) {
//                System.out.println(i +" 곱하기 "+ j + "는 " + i*j + "입니다.");
//            }
//        } 

        //선택한 단 빼고 구구단 만들기
        Scanner sc = new Scanner(System.in);
        int passnum = sc.nextInt();
        for(int i=2; i<=9; i++) {
            if(i == passnum) {
                continue;
            }
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + " 곱하기 " + j + "는 " + i * j + "입니다.");
                }

        }
    }
}
