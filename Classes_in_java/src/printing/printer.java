package printing;

/**
 * Created by Dishan Croning on 7/21/2015.
 */
public class printer {

    public boolean isOn;
    public String modelNumber;

    //method 'print'
    public void print()
    {
        System.out.println(modelNumber);//print the modelNumber
    }

    //method 'print' overloading
    public void print(String text)
    {
        System.out.println(text);//print the text
    }

    public String getModelNumber()
    {
        return modelNumber;
    }

}
