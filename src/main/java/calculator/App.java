package calculator;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int count = 0;
        int[] resultArr = new int[10];
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
                System.out.println(Arrays.toString(resultArr));
                break;
            }
            System.out.println("결과: " + result);
            if (count <= 9) {
                resultArr[count] = result;
                System.out.println(Arrays.toString(resultArr));
            } else if (count >= 10) {
                for (int i=0; i<10; i++) {
                    if (i == 9) {
                        resultArr[i] = result;
                    } else {
                        resultArr[i] = resultArr[i + 1];
                    }
                }
                System.out.println(Arrays.toString(resultArr));
            }
            count++;


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitStr = sc.next(); // 종료 여부 입력값 생성
            if (exitStr.equals("exit")) {
                stop = true;
            } else {
                stop = false;
            }
        }
    }
}
