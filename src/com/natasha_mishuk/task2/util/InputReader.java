package com.natasha_mishuk.task2.util;

import com.natasha_mishuk.task2.matrix.MatrixParameters;
import com.natasha_mishuk.task2.number.Number;
import com.natasha_mishuk.task2.number.ParameterValidator;

import java.util.Scanner;

public class InputReader {

    public void readNumberFromConsole(Number localNumber) {

       ParameterValidator objectValidator = new ParameterValidator();
       Scanner objectReader = new Scanner(System.in);
       ReportPrinter objectPrinter=new ReportPrinter();

            if (objectReader.hasNextDouble()) {

                double tempNumber=objectReader.nextDouble();

                if (objectValidator.checkDigitalCapacity(tempNumber)) {

                    localNumber.setEnteredNumber(tempNumber);

                }   else {

                    objectPrinter.printWrongCapacityMesage();
                    objectPrinter.askForInputMessage();
                    readNumberFromConsole(localNumber);
            }
            }
            else {
                    objectPrinter.printWrongFormatMessage();
                    objectPrinter.askForInputMessage();
                    readNumberFromConsole(localNumber);
                }


    }

    public void readMatrixCapacityFromConsole(MatrixParameters localMatrix) {

        Scanner objectReader = new Scanner(System.in);
        ReportPrinter objectPrinter=new ReportPrinter();
        ParameterValidator objectValidator = new ParameterValidator();
        if (objectReader.hasNextInt()) {

            int tempCapacity=objectReader.nextInt();

              if(objectValidator.checkIfPositive(tempCapacity))  {
                  localMatrix.setMatrixCapacity(tempCapacity);
              } else {
                  objectPrinter.printWrongCapacityMesage();
                  objectPrinter.askMatrixCapacityMessage();
                  readMatrixCapacityFromConsole(localMatrix);

              }


        }
        else {
            objectPrinter.printWrongFormatMessage();
            objectPrinter.askMatrixCapacityMessage();
            readMatrixCapacityFromConsole(localMatrix);
        }


    }

    public void readMatrixDivisor(MatrixParameters localMatrix){
        Scanner objectReader = new Scanner(System.in);
        ReportPrinter objectPrinter=new ReportPrinter();
        ParameterValidator objectValidator = new ParameterValidator();
        if (objectReader.hasNextInt()) {
            int tempDivisor=objectReader.nextInt();
            if(objectValidator.checkIfPositive(tempDivisor)){
                localMatrix.setMatrixDivisor(tempDivisor);
            }else{
                objectPrinter.printWrongDivisorMesage();
                objectPrinter.askMatrixDivisorMessage();
                readMatrixDivisor(localMatrix);
            }
        } else{
            objectPrinter.printWrongFormatMessage();
            objectPrinter.askMatrixDivisorMessage();
            readMatrixDivisor(localMatrix);

        }


    }
}

