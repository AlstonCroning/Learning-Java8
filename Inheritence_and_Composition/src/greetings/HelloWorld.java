package greetings;

import javafx.print.Printer;
import printing.printer;//import statement for the printer


/**
 * Created by Dishan Croning on 7/20/2015.
 */
public class HelloWorld {

    public static void main(String[] args)
    {
        printer myPrinter = new printer(true,"MY PRINTER");

        myPrinter.loadPaper(3);
        myPrinter.print(4);

    }
}