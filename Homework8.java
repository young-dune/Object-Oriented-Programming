import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        // 미리 저장된 ID와 비밀번호 쌍을 해시맵에 저장
        HashMap<String, String> creditInfo = new HashMap<>();
        creditInfo.put("myId", "myPass");
        creditInfo.put("myId2", "myPass2");
        creditInfo.put("myId3", "myPass3");

        // 사용자에게 ID를 입력받음
        Scanner scanner = new Scanner(System.in);
        System.out.print("id와 password를 입력해주세요\nid : ");
        String enteredId = scanner.nextLine().trim(); // 입력된 ID의 앞뒤 공백을 제거

        // 입력된 ID가 존재하지 않으면 다시 입력 요청
        if (!creditInfo.containsKey(enteredId)) {
            System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");
        } else {
            // 입력된 ID가 존재하면 비밀번호를 입력받음
            System.out.print("password : ");
            String enteredPassword = scanner.nextLine().trim(); // 입력된 비밀번호의 앞뒤 공백을 제거

            // 입력된 비밀번호와 저장된 비밀번호가 일치하는지 확인
            if (enteredPassword.equals(creditInfo.get(enteredId))) {
                System.out.println("id와 비밀번호가 일치합니다");
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
            }
        }
    }
}
