package ru.job4j.condition;
public class Types {
    public static void main(String[] args) {
         long l = 129;
         byte b = (byte) l;
         System.out.println("Произошла потеря данных " + b);

         float f = 12358.7f;
         int v  = 45981;
         short rsl = (short) (f + v);
         System.out.println("Данные в порядке " + rsl);

         char c = 45000;
         float t = c;
         System.out.println("Данные в порядке " + t);

         double d = 121.19;
         byte g = (byte) d;
         System.out.println("Произошла потеря данных " + g);

         short s = 1500;
         char z = (char) s;
         System.out.println("Данные в порядке " + z);

         short m = 1500;
         char n = (char) m;
         double h = n;
         System.out.println("Данные в порядке  " + h);
    }
}
