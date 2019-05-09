package com.company;

//5. Написать метод, который проверяет, является ли строка адресом IPv4.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    Pattern p;
    Matcher m;

    public void task5() {

        p = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");

        m = p.matcher("255.0.1.17");
        System.out.println("\nЗадание 5: " + m.find());
    }
}
