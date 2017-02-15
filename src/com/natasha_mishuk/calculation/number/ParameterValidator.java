package com.natasha_mishuk.calculation.number;

public class ParameterValidator {

    public double makePositive(double localParameter) {

        if (localParameter > 0) return localParameter;
        else return localParameter*=-1;
    }


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

    public boolean checkIfPositive(int localParameter)
    {
        if (localParameter>0){
            return true;
        }else {
            return false;
        }
    }


}
