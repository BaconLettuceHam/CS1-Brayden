//Brayden Hawkins
import java.util.Scanner;

class CS1twice
{
    public static void main (String args[])
    {
        //Scanner
        Scanner twice = new Scanner(System.in);
        //Prompt and Arithmetic
        System.out.println("Please place a number to be doubled.");
        float num1 = twice.nextFloat();
        float num2 = num1*2;
        System.out.println("The result is: "+num2+".");
        twice.close();
    }
}