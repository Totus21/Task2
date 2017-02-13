import java.util.Scanner;

public class Reader {
    public void readFromConsole(Number localNumber) {
        ParameterValidator objectValidator = new ParameterValidator();
        Scanner objectReader = new Scanner(System.in);
        Printer objectPrinter=new Printer();


            if (objectReader.hasNextDouble()) {
                localNumber.setEnteredNumber(objectValidator.makePositive(objectReader.nextDouble()));
                localNumber.setNumberCapacity(objectValidator.returnDigitalCapacity(localNumber.getEnteredNumber()));} else {
                    objectPrinter.printWrongFormatMessage();

            }


    }
}
