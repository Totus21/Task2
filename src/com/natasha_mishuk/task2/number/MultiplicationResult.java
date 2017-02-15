package com.natasha_mishuk.task2.number;

import com.natasha_mishuk.task2.number.Number;

public class MultiplicationResult {

    public void calculateMultiplication(Number localNumber )
    {
        double tempValue;
        int intermediateResult=1;

        if (localNumber.getEnteredNumber()<0){

            tempValue=localNumber.getEnteredNumber()*(-1);

        } else{

            tempValue=localNumber.getEnteredNumber();
        }


        while  ((int)tempValue % 10 >0)
        {
            intermediateResult=intermediateResult*((int)tempValue % 10);
            tempValue=tempValue/10;


        }

        localNumber.setMultiplicationResult(intermediateResult);




    }

}
