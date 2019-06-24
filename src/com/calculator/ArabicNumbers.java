package com.calculator;

public class ArabicNumbers extends Numbers {
    int oneOperand;
    int twoOperand;
    String operator;
    int rezult;

    ArabicNumbers(String[]massiv){
        oneOperand = Integer.parseInt(massiv[0]);
        twoOperand = Integer.parseInt(massiv[2]);
        operator = massiv[1];
    }

    public int arifmetic() {
        if (operator.equals("+")) {
            rezult = oneOperand + twoOperand;
        } else if (operator.equals("-")) {
            rezult = oneOperand - twoOperand;
        } else if (operator.equals("*")) {
            rezult = oneOperand * twoOperand;
        } else {
            rezult = oneOperand / twoOperand;
        }
        return rezult;
    }

}
