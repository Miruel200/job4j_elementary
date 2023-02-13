package ru.job4j.converter;

    public class Converter {

        public static float rubleToEuro(float value) {
            float rsl = value / 70;
            return rsl;
        }

        public static float rubleToDollar(float value) {
            float rsl = value / 60;
            return rsl;
        }

        public static void main(String[] args) {
            float euro = Converter.rubleToEuro(140);
            float dollar = Converter.rubleToDollar(140);
            float in = 140;
            float expected = 2.3333333f;
            float out = Converter.rubleToDollar(in);
            boolean passed = expected == out;
            System.out.println("140 rubles are 2.33 Test result: " + passed);
            System.out.println("140 rubles are " + euro + " euro.");
            System.out.println("140 rubles are " + dollar + " dollar.");

        }
    }

