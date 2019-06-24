package com.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        String[] arrayInput = x.split("\\\\+|\\\\-|\\\\*|\\\\/|\\\\=|\\\\%");
        /*  При вводе пользователем строки вроде 3 + II калькулятор должен выбросить исключение и прекратить свою работу.
            При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.
            При вводе пользователем строки не соответствующей одной из вышеописанных арифметических операций
            приложение выбрасывает исключение и завершает свою работу
         */

            if (Numbers.isNumber(arrayInput) == false) {
                throw new NumberFormatException("Введите либо римские от I до X, либо арабские от 1 до 10");
            }
            if (ArithmeticOperator.isArithmeticOperator(arrayInput[1]) == false) {
                throw new ArrayStoreException("Такого оператора не существует");
            }

            if (Numbers.isArabicNumber(arrayInput) == true) {
                ArabicNumbers arabicNumbers = new ArabicNumbers(arrayInput);
                System.out.println(arabicNumbers.arifmetic());
            } else if (Numbers.isRomanNumber(arrayInput) == true) {
                RomanNumbers romanNumbers = new RomanNumbers(arrayInput);
                System.out.println("Римская арифметика");
            }
            else {
            System.out.println("Беда");
        }
    }
}
