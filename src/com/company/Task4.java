package com.company;

/*
Написать программу, выполняющую поиск в строке мобильных телефонных номеров в формате +375XXYYYYYYY
и заменяющую каждый телефон на тот же, но в формате +375 (XX) YYY-YY-YY
X - код оператора
Y - номер телефона
*/

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task4 {

    public void task4(){
        Pattern p;
        Matcher m;
        System.out.println("Задание 4: ");
        String tel = "+375292221717 - УГАИ ГУВД Мингорисполкома";
        p = Pattern.compile("\\+375(\\d{2})(\\d{3})(\\d{2})(\\d{2})");
        m = p.matcher(tel);
        int end = 0;
        while (m.find()) {
            for(int i = 0; i < m.start(); i++){
                System.out.print(tel.charAt(i));
            }
            System.out.format("+375 (%s) %s-%s-%s", m.group(1), m.group(2),
                    m.group(3), m.group(4));
            end = m.end();
        }
        for(int i = end; i < tel.length(); i++){
            System.out.print(tel.charAt(i));
        }
    }
}
