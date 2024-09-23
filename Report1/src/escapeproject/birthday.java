package escapeproject;

import java.util.Scanner;

public class birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 생일 입력 받기
        System.out.print("생일 입력 하세요>> ");
        int birthday = scanner.nextInt();

        // 연도, 월, 일 추출
        int year = birthday / 10000;       // 앞 4자리 연도
        int month = (birthday / 100) % 100; // 중간 2자리 월
        int day = birthday % 100;          // 마지막 2자리 일

        // 출력
        System.out.println(year + "년 " + month + "월 " + day + "일");
    }
}
