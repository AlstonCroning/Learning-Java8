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

    //method 'print' copies
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

    //method print color names of an array using 'for each loop' construct
    public void printColors(){
        String[] colors = new String[] {"red", "blue", "green"};

        //using the 'for each' loop construct
        //both 'for loop' and 'for each loop' have the same keywords except the parameters
        for(String currentColor : colors){
            System.out.println(currentColor);
        }

    }

    //method 'print' text
    private void print(String text)
    {
        System.out.println(text);//print the text
    }

    public String getModelNumber()
    {
        return modelNumber;//return value
    }

}
