package printing;

/**
 * Created by Dishan Croning on 7/21/2015.
 */
public class printer {

    public boolean isOn;
    public String modelNumber;

    //printer Constructor (not default)
    public printer(boolean isOn,String modelNumber){

        this.isOn = isOn;
        this.modelNumber = modelNumber;
    }

    //method 'print'
    public void print()
    {
        System.out.println(isOn);//print boolean value
        System.out.println(modelNumber);//print the modelNumber
    }

    //method 'print' overloading
    public void print(String text)
    {
        System.out.println(text);//print the text
    }

    public String getModelNumber()
    {
        return modelNumber;//return value
    }

}
