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
        //System.out.println(isOn);//print boolean value
        //System.out.println(modelNumber);//print the modelNumber
        //print("I can call this!");

        switch (copies)
        {
            case 0 :

                break;
            case 1 :
            case 5 :
                if(isOn)
                {
                    System.out.println(modelNumber + " is on!");
                }
                else
                {
                    System.out.println(modelNumber + " is off!");
                }
                break;

            case 2 :
                if(isOn)
                {
                    System.out.println(modelNumber + " is on!");
                    System.out.println(modelNumber + " is on!");
                }
                else
                {
                    System.out.println(modelNumber + " is off!");
                    System.out.println(modelNumber + " is off!");
                }
                break;

            default:
                System.out.println("Number of copies is not supported");

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
