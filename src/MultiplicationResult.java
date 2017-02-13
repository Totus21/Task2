import java.lang.Math;

public class MultiplicationResult {

    public double calculateMultiplication(double localValue )
    {

        double intermediateResult=1;

        if (localValue<0) localValue*=-1;
        if (localValue!=0)
           {
               while  ((int)localValue % 10 >0)
        {
            intermediateResult=intermediateResult*((int)localValue % 10);
            localValue=localValue/10;


        }

               return (int)intermediateResult;
       } else  return 0;

    }

}
