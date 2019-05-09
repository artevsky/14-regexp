package com.company;

//Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у которых есть параметры, например <p id ="p1">,
//и замену их на простые теги абзацев <p>.

public class Task3 {
    public void task3() {

        String str =
                "\nЗадание 3:\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\n" +
                "<html>\n" +
                " <head>\n" +
                "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n" +
                "  <title>Применение абзацев</title>\n" +
                " </head>\n" +
                " <body>\n" +
                "   <p align = \"center\">Высоко — высоко в горах, среди великолепных снежных вершин, обитал самый свежий и свободный ветер.</p>\n" +
                "   <p id = \" p1 \">Он был быстр как удар молнии, силен как девятый вал и смел как влюбленный юноша!</p>\n" +
                "   <p>Но вот однажды, решил он взглянуть на мир за пределами горных вершин и спустился в долину.</p>\n" +
                "   <p>И увидел диковинную вещь, сотворенную людскими руками — это была ветряная мельница.</p>\n" +
                "   <p>Решил вольный ветер поближе разглядеть непонятную вещь, да так и запутался в лопастях, что уже никогда не смог выкрутиться.</p>\n" +
                "   <p>И с тех самых пор так и крутит он мельничные крылья и не знает больше другой жизни.</p>\n" +
                "   <p>Так давайте же выпьем за то, что бы никогда любопытство не лишало нас свободы!</p>\n" +
                " </body>\n" +
                "</html>";
        System.out.println(str.replaceAll("<p.*>\\b", "<p>"));

    }
}