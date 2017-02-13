
import java.util.Scanner;


public class Runner {
    public static void main(String[] args) {

        Reader objectReader = new Reader();
        Printer objectPrinter = new Printer();
        Number objectNumber = new Number();
        ParameterValidator objectValidator = new ParameterValidator();
        objectPrinter.askForInputMessage();
        objectReader.readFromConsole(objectNumber);
        if (objectValidator.checkDigitalCapacity(objectNumber)) {
            objectPrinter.PrintResults(objectNumber);
        } else {
            objectPrinter.printCapacityWarrning();
        }


    }
}
