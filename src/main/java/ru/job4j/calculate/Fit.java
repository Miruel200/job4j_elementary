package ru.job4j.calculate;

public class Fit {
    public static double manWeight(short height) {
        double rsl = height - 100 * 1.5d;
        return rsl;
    }

    public static double womanWeight(short height1) {
        double rsl = height1 - 100 * 1.5d;
        return rsl;
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
