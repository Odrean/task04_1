package ru.vsu.cs.kochergin;

public class Main {

    public static void main(String[] args) {
        double sum1 = calculateSum1();
        double sum2 = calculateSum2();

        System.out.printf("Sum1: %f%n", sum1);
        System.out.printf("Sum2: %f%n", sum2);
    }

    public static double calculateSum1() {
        double sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum += 1 / Math.pow(i, 3);
        }

        return sum;
    }

    public static double calculateSum2() {
        double sum = 0;
        for (int i = 2; i <= 128; i+=2) {
            sum += 1 / Math.pow(i, 2);
        }

        return sum;
    }
}
