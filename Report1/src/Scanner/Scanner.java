package Scanner;

public static void main(String[] args) {
    // Scanner 객체 생성
    Scanner scanner = new Scanner(System.in);
    
    // 환율 상수 설정
    final int exchangeRate = 1200;

    // 사용자에게 달러 입력 받기
    System.out.print("$1 = 1200원입니다. 달러를 입력하세요: ");
    double dollars = scanner.nextDouble();

    // 달러를 원화로 변환
    double won = dollars * exchangeRate;

    // 변환 결과 출력
    System.out.printf("%.2f달러는 %.0f원입니다.\n", dollars, won);

    // Scanner 객체 닫기
    scanner.close();
}
}
