package game;

import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = (int) (Math.random() * 100);
        int guess = -1;
        String playAgain;

        do {
            System.out.println("수를 결정하였습니다. 맞추어 보세요.");
            while (guess != answer) {
                System.out.print(">> ");
                guess = scanner.nextInt();
                if (guess < answer) {
                    System.out.println("더 높게");
                } else if (guess > answer) {
                    System.out.println("더 낮게");
                } else {
                    System.out.println("맞았습니다.");
                }
            }
            System.out.print("다시 하시겠습니까(y/n)? ");
            playAgain = scanner.next();
            if (playAgain.equalsIgnoreCase("y")) {
                answer = (int) (Math.random() * 100);
                guess = -1;
            }
        } while (playAgain.equalsIgnoreCase("y"));

        scanner.close();
    }
}
