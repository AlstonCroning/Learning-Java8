package printing;

/**
 * Created by Dishan Croning on 7/21/2015.
 */
public class printer extends machine {

    //using access modifiers
    private String modelNumber;
    private paperTray paperTray = new paperTray();


    //printer Constructor (not default)
    public printer(boolean isOn,String modelNumber){
        super(isOn);
        this.modelNumber = modelNumber;
    }

    //prints number of copies given by the user
    public void print(int copies)
    {
        String onStatus = "";

        if(isOn)
            onStatus = " is on";
        else
            onStatus = " is off";

        String textToPrint = modelNumber + onStatus;

        //using while loop
        while(copies > 0 && !paperTray.isEmpty())
        {
            System.out.println(textToPrint);
            copies--;
            paperTray.usePage();
        }

        if(paperTray.isEmpty()){
            System.out.println("Load More Papers...");
        }
    }

    //prints names of colors of an array
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

    //prints User Entered Text
    private void print(String text)
    {
        System.out.println(text);//print the text
    }

    //return modelNumber
    public String getModelNumber()
    {
        return modelNumber;//return value
    }

    public void loadPaper(int count){
        paperTray.addPaper(count);
    }


}
