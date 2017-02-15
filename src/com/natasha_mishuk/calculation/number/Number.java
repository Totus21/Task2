package com.natasha_mishuk.calculation.number;

public class Number {

    private double enteredNumber;
    private int multiplicationResult;

    public void setEnteredNumber(double localEnteredNumber) {

        enteredNumber=localEnteredNumber;
    }

    public double getEnteredNumber() {
      return enteredNumber;
    }

    public void setMultiplicationResult(int multiplicationResult) {
        this.multiplicationResult = multiplicationResult;
    }

    public int getMultiplicationResult() {
        return multiplicationResult;
    }
}
