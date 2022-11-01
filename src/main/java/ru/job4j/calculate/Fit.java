package ru.job4j.calculate;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.5d;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.5d;
    }

    public static void main(String[] args) {
        short height = 187;
        short height1 = 160;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height1);
        System.out.println("Woman 160 is " + woman);
        System.out.println("Man 187 is " + man);
    }
}
