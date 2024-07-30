package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    private double result = 0;

    public double getResult() {
        return result;
    }

    public void setResult(double result2) {
        this.result = result2;
    }

    ArrayList<Double> resultArr = new ArrayList<>();

    public void removeResult() {
        resultArr.remove(0);
    }

    public void add(double a, double b) {
        result = a + b;
    }

    public void subtract(double a, double b) {
        result = a - b;
    }

    public void multiply(double a, double b) {
        result = a * b;
    }

    public void divide(double a, double b) {
        if (b == 0) {
            System.out.println("0이 올 수 없음");
        }
        result = a / b;
    }
}





