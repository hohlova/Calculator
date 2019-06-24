package com.calculator;

public class ArithmeticOperator {
    static String[] values = {"+", "-", "*", "/"};

    static boolean isArithmeticOperator(String operator) {
        if ((values[0].equals(operator) == true) | (values[1].equals(operator) == true)
                | (values[2].equals(operator) == true) | (values[3].equals(operator) == true)) {
            return true;
        } else return false;
    }



}
