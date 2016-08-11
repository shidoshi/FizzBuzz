import java.util.*;
import java.io.*;

public class RayFizz 
{
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String NEWLINE = "\n";
    private static final String SPACE = " ";
    public static String buffer;

    public static void fizzBuzz (int fizzNum) 
    {
        int normFlag = 0;

        if ( ((fizzNum % 3) == 0) && (fizzNum != 0) )
        {
            buffer = buffer + FIZZ;
            normFlag++;
        }
        if ( ((fizzNum % 5) == 0) && (fizzNum != 0) )
        {
            buffer = buffer + BUZZ;      
            normFlag++;
        } 

        if (normFlag < 1)
            buffer = buffer + String.valueOf(fizzNum);
        
        buffer = buffer + SPACE;

    }

    public static void fizzAsc(int argOne, int argTwo)
    {
        for (int i=argOne;i<=argTwo;i++)
            fizzBuzz(i);
    }

    public static void fizzDesc(int argOne, int argTwo)
    {
        for (int i=argOne;i>=argTwo;i--)
            fizzBuzz(i);
    }

    public static void myRayFizz(int argOne, int argTwo)
    {
        if (argOne == argTwo)
            fizzBuzz(argOne);
        if (argOne < argTwo)
            fizzAsc(argOne, argTwo);
        if (argOne > argTwo)
            fizzDesc(argOne, argTwo);

        buffer = buffer + NEWLINE;
    }

    public static void main (String[] args)
    {
        buffer = "";
        
        myRayFizz(-100,100);
        myRayFizz(15,15);
        myRayFizz(100,-100);

        System.out.println(buffer);
    }
}