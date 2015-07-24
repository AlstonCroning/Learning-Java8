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
        for (int i = 0; i < copies; i++)
        {
            if(isOn)
            {
                System.out.println(modelNumber + " is on!");
            }
            else
            {
                System.out.println(modelNumber + " is off!");
            }
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
