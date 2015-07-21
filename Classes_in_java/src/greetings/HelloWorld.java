package greetings;

import printing.printer;//import statement for the printer


/**
 * Created by Dishan Croning on 7/20/2015.
 */
public class HelloWorld {

    public static void main(String[] args)
    {
        //creating a new instance
        printer myPrinter = new printer();//using type printer
        myPrinter.isOn = false;
        myPrinter.modelNumber = "ABCD";

        printer yourPrinter = new printer();
        yourPrinter.isOn = true;
        yourPrinter.modelNumber = "FGH";

        System.out.println("hello World");
        System.out.println("myPrinter model is: " + myPrinter.modelNumber);
        System.out.println("yourPrinter model is: " + yourPrinter.modelNumber);
    }
}