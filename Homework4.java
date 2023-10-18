import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 수를 입력하세요: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int result = gcd(m, n);
        int result2 = gcdWhile(m, n);
        System.out.printf("두 수의 최대공약수(재귀호출)는 %d입니다.\n", result);
        System.out.printf("두 수의 최대공약수(반복문)는 %d입니다.\n",result2);
    }
    static int gcd(int m, int n){
        //재귀호출
        if(m==0){
            return n;
        }
        if (m%n ==0){
            return n;
        }

        return gcd(n,m%n);
    }

    static int gcdWhile(int m, int n) {
        //반복문
        while (m != 0) {
            if (m % n == 0) {
                return n;
            }
            int temp = m;
            m = n;
            n = temp % n;
        }
        return m;
    }
}
