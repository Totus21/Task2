package com.natasha_mishuk.task2.main;

import com.natasha_mishuk.task2.util.InputReader;
import com.natasha_mishuk.task2.util.ReportPrinter;
import com.natasha_mishuk.task2.number.UserNumber;
import com.natasha_mishuk.task2.number.MultiplicationResult;


public class Runner {
    public static void main(String[] args) {

        InputReader objectReader = new InputReader();
        ReportPrinter objectPrinter = new ReportPrinter();
        UserNumber objectNumber = new UserNumber();
        MultiplicationResult objectMultiplication=new MultiplicationResult();

        //вычесление произведения
        objectPrinter.askForInputMessage();
        objectReader.readNumberFromConsole(objectNumber);
        objectMultiplication.calculateMultiplication(objectNumber);
        objectPrinter.PrintResults(objectNumber);

    }
}
