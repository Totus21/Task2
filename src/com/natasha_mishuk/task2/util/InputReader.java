package com.natasha_mishuk.task2.util;


import com.natasha_mishuk.task2.number.UserNumber;
import com.natasha_mishuk.task2.number.ParameterValidator;

import java.util.Scanner;

public class InputReader {

    public void readNumberFromConsole(UserNumber localNumber) {

       ParameterValidator objectValidator = new ParameterValidator();
       Scanner objectReader = new Scanner(System.in);
       ReportPrinter objectPrinter=new ReportPrinter();

            if (objectReader.hasNextDouble()) {

                double tempNumber=objectReader.nextDouble();

                if (objectValidator.checkDigitalCapacity(tempNumber)) {

                    localNumber.setEnteredUserNumber(tempNumber);

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


}

