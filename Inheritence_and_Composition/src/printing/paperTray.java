package printing;

/**
 * Created by Dishan Croning on 7/28/2015.
 */
public class paperTray {
    int pages = 0;

    public void addPaper(int count){
        pages += count;
    }

    public void usePage(){
        pages--;
    }

    public boolean isEmpty(){
        return pages <= 0;
    }
}
