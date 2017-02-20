package com.natasha_mishuk.task2.number;

public class UserNumber {

    private double enteredNumber;
    private int multiplicationResult;

    public void setEnteredUserNumber(double localEnteredNumber) {

        enteredNumber=localEnteredNumber;
    }

    public double getEnteredUserNumber() {

        return enteredNumber;
    }

    public void setMultiplicationResult(int multiplicationResult) {

        this.multiplicationResult = multiplicationResult;
    }

    public int getMultiplicationResult() {

        return multiplicationResult;
    }
}
