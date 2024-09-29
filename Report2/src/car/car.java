package car;

import java.util.Scanner;

public class car {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("자동차 상태 입력>>");
        int status = scanner.nextInt();

        int temperature = status & 0b00111111;
        boolean isAirConditionerOn = (status & 0b01000000) != 0;
        boolean isCarRunning = (status & 0b10000000) != 0;

        System.out.print("자동차는 ");
        if (isCarRunning) {
            System.out.print("달리는 상태이고 ");
        } else {
            System.out.print("정지 상태이고 ");
        }

        if (isAirConditionerOn) {
            System.out.print("에어컨이 켜진 상태이고 ");
        } else {
            System.out.print("에어컨이 꺼진 상태이고 ");
        }

        System.out.println("온도는 " + temperature + "도입니다.");
    }
}
