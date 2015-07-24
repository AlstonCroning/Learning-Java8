package printing;

/**
 * Created by Dishan Croning on 7/21/2015.
 */
public class printer {


    //using access modifiers
    private boolean isOn;
    private String modelNumber;

    //printer Constructor (not default)
    public printer(boolean isOn,String modelNumber){

        this.isOn = isOn;
        this.modelNumber = modelNumber;
    }

    //method 'print'
    public void print(int copies)
    {
        String onStatus = "";

        if(isOn)
            onStatus = " is on";
        else
            onStatus = " is off";

        String textToPrint = modelNumber + onStatus;

        //using for loops
        for (int i = 0; i < copies; i++)
        {
            System.out.println(textToPrint);
        }
    }

    //method 'print' overloading
    private void print(String text)
    {
        System.out.println(text);//print the text
    }

    public String getModelNumber()
    {
        return modelNumber;//return value
    }

}
