package com.natasha_mishuk.task2.main;

import com.natasha_mishuk.task2.util.InputReader;
import com.natasha_mishuk.task2.util.ReportPrinter;
import com.natasha_mishuk.task2.number.Number;
import com.natasha_mishuk.task2.number.MultiplicationResult;
import com.natasha_mishuk.task2.matrix.MatrixParameters;
import com.natasha_mishuk.task2.matrix.MatrixUtil;
import com.natasha_mishuk.task2.matrix.MatrixCalculation;


public class Runner {
    public static void main(String[] args) {

        InputReader objectReader = new InputReader();
        ReportPrinter objectPrinter = new ReportPrinter();
        Number objectNumber = new Number();
        MultiplicationResult objectMultiplication=new MultiplicationResult();
        MatrixParameters objectMatrix=new MatrixParameters();
        MatrixUtil objectMatrixUtil=new MatrixUtil();
        MatrixCalculation objectMatrixCalculation=new MatrixCalculation();

        //вычесление произведения
        objectPrinter.askForInputMessage();
        objectReader.readNumberFromConsole(objectNumber);
        objectMultiplication.calculateMultiplication(objectNumber);
        objectPrinter.PrintResults(objectNumber);

        //В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К

        objectPrinter.askMatrixCapacityMessage();
        objectReader.readMatrixCapacityFromConsole(objectMatrix);
        objectMatrixUtil.generateMatrix(objectMatrix);
        objectPrinter.askMatrixDivisorMessage();
        objectReader.readMatrixDivisor(objectMatrix);
        objectMatrixCalculation.calculateMatrixSum(objectMatrix);
        objectPrinter.PrintMatrixResult(objectMatrix);
    }
}
