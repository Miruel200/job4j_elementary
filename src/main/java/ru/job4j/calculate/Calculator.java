package ru.job4j.calculate;

import ru.job4j.math.MathFunction;

public class Calculator {

    public  static double SumAndMultiply(double first, double second) {
        return  MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double DifAndDiv(double first, double second)  {
        return MathFunction.difference(first, second)
                + MathFunction.div(first, second);
    }

    public static double AllOperacion(double first, double second)  {
        return MathFunction.sum(first, second) + MathFunction.multiply(first, second)
                + MathFunction.difference(first, second) + MathFunction.div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Рузультат расчета равен " + SumAndMultiply(10, 20));
        System.out.println("Рузультат расчета равен " + DifAndDiv(10, 20 ));
        System.out.println("Рузультат расчета равен " + AllOperacion(10, 20 ));
    }
}
