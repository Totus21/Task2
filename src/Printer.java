/**
 * Created by Natasha_Mishuk on 2/12/2017.
 */
public class Printer {
    public void PrintResults(Number localNumber)
    {
        MultiplicationResult objectResult = new MultiplicationResult();
        System.out.println("Number : " + (int)localNumber.getEnteredNumber());
        System.out.println("Result = " + (int)objectResult.calculateMultiplication(localNumber.getEnteredNumber()));

    }

    public void askForInputMessage()
    {
        System.out.println("Enter digital integer value to calculate or any non-digital value to exit");
    }

    public void printCapacityWarrning()
    {
        System.out.println("Non expected capacity, please try again with correct capacity");
    }

    public void printWrongFormatMessage()
    {
        System.out.println("Non-digitalvalue is entered. Closing program");
    }
}
