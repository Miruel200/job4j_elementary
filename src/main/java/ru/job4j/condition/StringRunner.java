package ru.job4j.condition;

@SuppressWarnings("checkstyle:WhitespaceAround")
public class StringRunner {
    public static void main(String[] args) {
        String idea = " I like java";
        System.out.println(idea);
        idea += idea + " But I am am newbie";
        int year = 2022;
        idea += idea + " " + year;
        System.out.println(idea);
    }
}

