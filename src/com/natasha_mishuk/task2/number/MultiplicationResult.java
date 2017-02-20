package com.natasha_mishuk.task2.number;

public class MultiplicationResult {

    public void calculateMultiplication(UserNumber localNumber )
    {
        double tempValue;
        int intermediateResult=1;

        if (localNumber.getEnteredUserNumber()<0){

            tempValue=localNumber.getEnteredUserNumber()*(-1);

        } else{

            tempValue=localNumber.getEnteredUserNumber();
        }


        while  ((int)tempValue % 10 >0)
        {
            intermediateResult=intermediateResult*((int)tempValue % 10);
            tempValue=tempValue/10;


        }

        localNumber.setMultiplicationResult(intermediateResult);




    }

}
