package com.calculator;

import java.util.HashMap;
import java.util.Map;

public class Numbers {
    /* Метод isNumber() проверяет соответствие вводимых значений от пользователя условиям задачи.
    Пользователь должен ввести [0]и[2] - числа одного из видов - арабские или римские. Возможные значения ввода указаны
    в Мар tabArabicRoman.
     */
    static boolean isNumber(String[] arrayInput) {
        Map<String, String> tabArabicRoman = new HashMap<>();
        String[] keys = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] values = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 0; keys.length>i; i++) {          //заполнение tabArabicRoman церез цикл
            tabArabicRoman.put(keys[i], values[i]);
        }
        if ((tabArabicRoman.containsKey(arrayInput[0]) == true) && (tabArabicRoman.containsKey(arrayInput[2]) == true)) {
            return true;
        } else if ((tabArabicRoman.containsValue(arrayInput[0]) == true) && (tabArabicRoman.containsValue(arrayInput[0]) == true)) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isArabicNumber(String[] arrayInput) {
        boolean isArabic = false;
        String[] keys = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <10; j++) {
                if (arrayInput[0].equals(keys[i]) == true && arrayInput[2].equals(keys[j]) == true){
                    isArabic = true;
                    break;
                }
            }
        }
        return isArabic;

    }

    static boolean isRomanNumber(String[] arrayInput) {
        boolean isRoman = false;
        String[] values = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arrayInput[0].equals(values[i]) == true && arrayInput[2].equals(values[j]) == true){
                    isRoman = true;
                    break;
                }
            }
        }
        return isRoman;
    }
}