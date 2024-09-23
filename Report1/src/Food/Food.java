package Food;

import java.util.Scanner;

public class Food {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 가격 설정
        int tteokbokkiPrice = 200;
        int gimbapPrice = 1000;
        int jjolmyeonPrice = 3000;

        // 주문 받기
        System.out.print("떡볶이 몇 인분 >>> ");
        int tteokbokkiCount = scanner.nextInt();

        System.out.print("김말이 몇 인분 >>> ");
        int gimbapCount = scanner.nextInt();

        System.out.print("쫄면 몇 인분 >>> ");
        int jjolmyeonCount = scanner.nextInt();

        // 총 금액 계산
        int totalPrice = (tteokbokkiPrice * tteokbokkiCount) + (gimbapPrice * gimbapCount) + (jjolmyeonPrice * jjolmyeonCount);

        // 결과 출력
        System.out.println("전체 금액은 " + totalPrice + "원입니다.");

        scanner.close();
    }
}
