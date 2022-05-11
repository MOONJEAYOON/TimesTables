package com.example.example1;
import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.Scanner;
public class TimesTables {


//[안내]희망하는 구구단을 숫자로 입력해 주세요 (2 ~ 9) : 10
//
//            10 단 이 입력되었습니다.
//[경고]구구단은 2단 ~ 9단 까지만 선택할 수 있습니다.
//    프로그램을 종료합니다.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("[안내]희망하는 구구단을 숫자로 입력해 주세요 (2 ~ 9) : ");
        int rum = scan.nextInt();
        System.out.println(rum + "단 이 입력되었습니다.");

        if (rum < 2 || rum > 9) {
            System.out.println("[경고]구구단은 2단 ~ 9단 까지만 선택할 수 있습니다.");
            scan.close();
            return;
        }

        for (int i = 1; i <= 9; ++i){
            System.out.println(rum + " * " + i + " = " + (rum * i));
        }
        scan.close();
        return;

    }
}
