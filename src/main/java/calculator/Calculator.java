package calculator;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    double result;
    public double getResult() {
        return result;
    }
    // 덧셈 메서드
    public void add(double a, double b) {result = a + b;}
    // 뺄셈 메서드
    public void subtract(double a, double b) {result = a - b;}
    // 곱셈 메서드
    public void multiply(double a, double b) {result = a * b;}
    // 나눗셈 메서드
    public void divide(double a, double b) {
        if (b == 0) {
            System.out.println("0이 올 수 없음");
        }
        result = a / b;}
}





