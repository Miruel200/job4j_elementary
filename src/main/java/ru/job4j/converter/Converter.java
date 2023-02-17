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
            float dollar = Converter.rubleToDollar(120);
            float in = 120;
            int expected = 2;
            float out = Converter.rubleToDollar(in);
            boolean passed = expected == out;
            System.out.println("140 rubles are " + euro + " euro.");
            System.out.println("120 rubles are " + dollar + " dollar.");
            System.out.println("120 rubles are 2 Test result: " + passed);
            in = 140;
            expected = 2;
            out = Converter.rubleToEuro(in);
            passed = expected == out;
            System.out.println("140 rubles are 2 Test result: " + passed);

        }
    }

