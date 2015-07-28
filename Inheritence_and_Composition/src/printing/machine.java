package printing;

/**
 * Created by Dishan Croning on 7/27/2015.
 */
//Machine Class
public class machine {
    protected boolean isOn;


    public machine(boolean isOn){
        this.isOn = isOn;
    }


    public void turnOn(){
        isOn = true;
    }


    public void turnOff(){
        isOn = false;
    }

}
