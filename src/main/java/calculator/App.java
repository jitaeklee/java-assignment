package calculator;
import java.util.ArrayList;
import java.util.Scanner;



public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int count = 0;
        ArrayList<Integer> resultArr = new ArrayList<>();
        boolean stop = false;

        while(stop == false) {
        System.out.print("첫 번째 양의 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 양의 정수를 입력하세요 : ");
        int num2 = sc.nextInt();
        System.out.print("사칙연산 기호를 입력하세요 : ");
        char operator = sc.next().charAt(0);

            if (operator == '+') { // 사칙연산 기호 입력값이 "+"와 일치하면
                result = num1 + num2; // result 값은 num1 + num2
            } else if (operator == '-') { // 사칙연산 기호 입력값이 "-"와 일치하면
                result = num1 - num2; // result 값은 num1 - num2
            } else if (operator == '*') { // 사칙연산 기호 입력값이 "*"와 일치하면
                result = num1 * num2;
            } else if (operator == '/') { // 사칙연산 기호 입력값이 "/"와 일치하면
                if (num2 == 0) { // num2가 0일 경우
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 " + num2 + "은 입력될 수 없습니다.");
                } else {
                    result = num1 / num2;
                }
            } else {
                System.out.println("잘못 입력하셨습니다."); // 그 밖에는 해당 출력
                System.out.println(resultArr.toString());
                break;
            }
            System.out.println("결과 : " + result);
            resultArr.add(result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String removestr = sc.next();
            if (removestr.equals("remove")) {
            resultArr.remove(0);
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String showstr = sc.next();
            if (showstr.equals("inquiry")) {
                for(int i:resultArr) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitStr = sc.next();
            if (exitStr.equals("exit")) {
                stop = true;
            } else {
                stop = false;
            }
        }
    }
}
