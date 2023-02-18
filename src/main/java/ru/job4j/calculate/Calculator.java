package ru.job4j.calculate;

import ru.job4j.math.MathFunction;

public class Calculator {

    public  static double sumAndMultiply(double first, double second) {
        return  MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double difAndDiv(double first, double second)  {
        return MathFunction.difference(first, second)
                + MathFunction.div(first, second);
    }

    public static double allOperacion(double first, double second)  {
        return MathFunction.sum(first, second) + MathFunction.multiply(first, second)
                + MathFunction.difference(first, second) + MathFunction.div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Рузультат расчета равен " + sumAndMultiply(10, 20));
        System.out.println("Рузультат расчета равен " + difAndDiv(10, 20));
        System.out.println("Рузультат расчета равен " + allOperacion(10, 20));
    }
}
