package com.company;

//Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записанных по правилам Java,
//с помощью регулярных выражений и выводящую их на страницу.

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task2 {

    public void task2() {
        Pattern p;
        Matcher m;

        p = Pattern.compile("\\b0(x|X)[0-9A-Fa-f]+\\b");
        m = p.matcher("0x101 0xq 0xA 0x7FFF 0z56q");
        System.out.println("Задание 2: ");
        while (m.find()) {
            System.out.format("%s ", m.group());
        }
    }
}
