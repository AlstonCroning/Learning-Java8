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

    //prints copies
    public void print(int copies)
    {
        String onStatus = "";

        if(isOn)
            onStatus = " is on";
        else
            onStatus = " is off";

        String textToPrint = modelNumber + onStatus;

        //using while loop
        while(copies > 0)
        {
            System.out.println(textToPrint);
            copies--;
        }
    }

    //prints color names of an array
    public void printColors()
    {
        //colors array
        String[] colors = new String[] {"red", "blue", "green","yellow","orange"};

        //using the 'for each' loop construct
        for(String currentColor : colors){

            if("green".equals(currentColor))
                continue;
                //break;
            System.out.println(currentColor);
        }

    }

    //prints text
    private void print(String text)
    {
        System.out.println(text);//print the text
    }

    //return modelNumber
    public String getModelNumber()
    {
        return modelNumber;//return value
    }

}
