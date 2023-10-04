import java.util.Scanner;

public class Homework2 {
    public static class Student {
        private int studentNumber;
        private String name;
        private String major;
        private long phoneNumber;

        public Student(int studentNumber, String name, String major, long phoneNumber) {
            this.studentNumber = studentNumber;
            this.name = name;
            this.major = major;
            this.phoneNumber = phoneNumber;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[3];

        // 학생의 정보를 입력
        for (int i = 0; i < 3; i++) {
            System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요 " + (i + 1));

            int studentNumber = scanner.nextInt();
            String name = scanner.next();
            String major = scanner.next();
            long phoneNumber = scanner.nextLong();

            students[i] = new Student(studentNumber, name, major, phoneNumber);
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다:");
        System.out.println("첫번째 학생: " + students[0].studentNumber + " " + students[0].name + " " +
                students[0].major + " " + formatPhoneNumber(students[0].phoneNumber));
        System.out.println("두번째 학생: " + students[1].studentNumber + " " + students[1].name + " " +
                students[1].major + " " + formatPhoneNumber(students[1].phoneNumber));
        System.out.println("세번째 학생: " + students[2].studentNumber + " " + students[2].name + " " +
                students[2].major + " " + formatPhoneNumber(students[2].phoneNumber));

        scanner.close();
    }

    private static String formatPhoneNumber(long phoneNumber) {
        String phoneNumberStr = String.format("%011d", phoneNumber);
        return "010-" + phoneNumberStr.substring(3, 7) + "-" + phoneNumberStr.substring(7);
    }
}
