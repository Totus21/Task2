package com.natasha_mishuk.task2.util;


import com.natasha_mishuk.task2.number.UserNumber;

public class ReportPrinter {

   public void PrintResults(UserNumber localNumber)
    {

        System.out.println("Entered number : " + localNumber.getEnteredUserNumber());
        System.out.println("Result = " + localNumber.getMultiplicationResult());

    }


    public void askForInputMessage()
    {
        System.out.println("Enter digital value to calculate (expected capacity is 4 digit)");
    }

    public void printWrongCapacityMesage()
    {
        System.out.println("Non expected capacity, please try again with correct capacity");
    }



    public void printWrongFormatMessage()
    {
        System.out.println("Non-digital value is entered. Try again");
    }



}
