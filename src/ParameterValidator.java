/**
 * Created by Natasha_Mishuk on 2/9/2017.
 */
public class ParameterValidator {

    public double makePositive(double localParameter) {

        if (localParameter > 0) return localParameter;
        else return localParameter*=-1;
    }


    public int  returnDigitalCapacity(double localParameter)
    {
        int localCounter=0;
           do {
               localCounter += 1;
               localParameter = localParameter / 10;



           }while ((int)localParameter % 10 > 0) ;

           return localCounter;
    }

    public boolean checkDigitalCapacity(Number localNumber)
    {
        if (localNumber.getNumberCapacity() == 4) {
            return true;

        }
     else {
       return false;

    }
    }

}
