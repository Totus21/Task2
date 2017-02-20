package com.natasha_mishuk.task2.number;

public class ParameterValidator {



    public boolean checkDigitalCapacity(double localParameter)
    {
        int localCounter=0;

        if(localParameter<0){

            localParameter=localParameter*(-1);
        }
           do {
               localCounter += 1;
               localParameter = localParameter / 10;

           }while ((int)localParameter % 10 > 0) ;

            if (localCounter==4){
                return true;

            }else {
                return false;

            }
    }


}
