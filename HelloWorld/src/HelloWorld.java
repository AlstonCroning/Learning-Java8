/**
 * Created by Dishan Croning on 7/18/2015.
 */

//Arrays in Java
public class HelloWorld
{
    public static void main(String[] args)
    {//String[] args is also an array

        int[] numbers = new int[10];

        numbers[0] = 5;
        numbers[1] = 8;

        System.out.println(numbers[0]);//answer is 5
        System.out.println(numbers[1]);//answer is 8
        System.out.println(numbers[2]);//answer is 0
        //answer is 0 because it initializes the default value is 0

    }
}

/*
//Strings Example
public class HelloWorld
{
    public static void main(String[] args)
    {
        //System.out.println("Hello World");
        String firstname = "John";
        String fullname = firstname + " Jimmy";
        System.out.println(fullname.indexOf('y'));
    }
}
*/