package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        String string = """
                Думаю, это будет новой фичей.
                Только не говорите никому, что она возникла случайно.
                """;

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        //напишите тут ваш код
        int count = 0;
        char[] list = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if(Character.isDigit(list[i])) {
                count++;
            }
        }
        return count;
    }

    public static int countLetters(String string) {
        //напишите тут ваш код
        int count = 0;
        char[] list = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if(Character.isLetter(list[i])) {
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String string) {
        //напишите тут ваш код
        int count = 0;
        char[] list = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if(Character.isSpaceChar(list[i])) {
                count++;
            }
        }
        return count;
    }
}
