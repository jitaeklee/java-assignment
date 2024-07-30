package calculator;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
        boolean stop = false;

        while (stop == false) {
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
            }

            System.out.println("결과 : " + cal.getResult());
            cal.resultArr.add(cal.getResult());

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String removestr = sc.next();
            if (removestr.equals("remove")) {
                cal.removeResult();
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String showstr = sc.next();
            if (showstr.equals("inquiry")) {
                cal.inquiryResults();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitStr = sc.next();
            if (exitStr.equals("exit")) {
                stop = true;
            } else {
                stop = false;
            }
        }
        System.out.println(cal.getResult());
    }
}




