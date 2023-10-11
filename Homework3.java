import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 개의 정수를 입력할 예정인가요? ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.print("수를 입력하세요: ");

        for (int i=0;i<n;i++){
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i=1; i<n;i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
            if(numbers[i]>max){
                max = numbers[i];
            }
        }

        System.out.printf("최대값: %d\n",max);
        System.out.printf("최소값: %d",min);

        scanner.close();
    }
}