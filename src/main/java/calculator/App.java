package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
        boolean stop = false;

        while (stop == false) {
            System.out.println("사칙연산 or 원의넓이 입력");
            String input = sc.next();

            switch (input) {
                case ("사칙연산"):
                    System.out.print("첫 번째 양의 정수를 입력하세요 : ");
                    double num1 = sc.nextInt();
                    System.out.print("두 번째 양의 정수를 입력하세요 : ");
                    double num2 = sc.nextInt();
                    System.out.print("사칙연산 기호를 입력하세요 : ");
                    char operator = sc.next().charAt(0);

                    switch (operator) { // 사칙연산 기호 입력값이 "+"와 일치하면
                        case ('+'):
                            cal.add(num1, num2);
                            break;
                        case ('-'):
                            cal.subtract(num1, num2);
                            break;
                        case ('*'):
                            cal.multiply(num1, num2);
                            break;
                        case ('/'):
                            cal.divide(num1, num2);
                            break;
                        default:
                            System.out.println("잘못된 연산자입니다");
                            continue;
                    }
                    System.out.println("결과 : " + cal.getResult());
                    cal.resultArr.add(cal.getResult());
                    break;
                case ("원의넓이"):
                    System.out.println("반지름을 입력하세요: ");
                    double radius = sc.nextDouble();
                    if (radius < 0) {
                        System.out.println("반지름은 음수일 수 없습니다.");
                    } else {
                        cal.calculateCircle(radius);
                        System.out.println("원의 넓이: " + cal.getArea());
                        cal.circleResultArr.add(cal.getArea());
                    }
                    break;
            }

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String removestr = sc.next();
            if (removestr.equals("remove")) {
                cal.removeResult();
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String showstr = sc.next();
            if (showstr.equals("inquiry")) {
                cal.inquiryResults();
                cal.inquiryCircleResults();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitStr = sc.next();
            if (exitStr.equals("exit")) {
                stop = true;
            }
        }
    }
}




