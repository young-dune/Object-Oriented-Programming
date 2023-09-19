import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i;

        System.out.println("정수를 입력하세요:");

        for (i = 0; i < 5; i++) {
            System.out.print("정수: ");
            int input = scanner.nextInt();
            sum += input;
            System.out.println("현재까지 입력된 정수의 합은 " + sum + "입니다.");
        }
    }
}
