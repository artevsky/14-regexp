package com.company;

// Написать программу, проверяющую, является ли введённая строка адресом электронного почтового ящика.
// В названии почтового ящика разрешить использование только букв, цифр и нижних подчёркиваний, при этом оно должно начинаться с буквы.
// Возможные домены верхнего уровня: .org .com

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Task1 {

    Pattern p;
    Matcher m;

    public void task1() {
//        p = Pattern.compile("^\\w[A-Za-z0-9]+_?[A-Za-z0-9]+@\\w+(.com|.org)");
        p = Pattern.compile("^[a-zA-Z]+\\w+@\\w+(.com|.org)");
        m = p.matcher("Artevsky_123@gmail.com");
        System.out.println("Задание 1: " + m.find());
    }
}
