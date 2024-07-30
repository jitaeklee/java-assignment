package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    private double result;
    private double area;

    Calculator() {
        result = 0;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    ArrayList<Double> resultArr = new ArrayList<>();
    ArrayList<Double> circleResultArr = new ArrayList<>();

    public void removeResult() {
        resultArr.remove(0);
    }

    public void inquiryResults() {
        for (double i : resultArr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void inquiryCircleResults() {
        for (double i : circleResultArr) {
            System.out.print(i + " ");
        }
        System.out.println();
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

    public void calculateCircle(double radius) {
        area = Math.PI * radius * radius;
    }
}





