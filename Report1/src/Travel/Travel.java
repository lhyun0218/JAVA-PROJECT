package Travel;

import java.util.Scanner;

public class Travel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 여행지 입력
        System.out.print("여행지: ");
        String destination = sc.nextLine();

        // 인원수 입력
        System.out.print("인원수: ");
        int numPeople = sc.nextInt();

        // 숙박일 입력
        System.out.print("숙박일: ");
        int numNights = sc.nextInt();

        // 1인당 항공료 입력
        System.out.print("1인당 항공료: ");
        int airfarePerPerson = sc.nextInt();

        // 1방 숙박비 입력
        System.out.print("1방 숙박비: ");
        int roomCostPerNight = sc.nextInt();

        // 필요한 방의 수 계산
        int numRooms = (numPeople + 1) / 2;

        // 총 항공료 계산
        int totalAirfare = numPeople * airfarePerPerson;

        // 총 숙박비 계산
        int totalAccommodation = numRooms * numNights * roomCostPerNight;

        // 총 경비 계산
        int totalCost = totalAirfare + totalAccommodation;

        // 결과 출력
        System.out.printf("%d명의 %s %d박 %d일 여행에는 방이 %d개 필요하며 경비는 %d원입니다.%n",
                numPeople, destination, numNights, numNights + 1, numRooms, totalCost);

        sc.close();
    }
}
