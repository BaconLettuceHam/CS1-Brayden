//Brayden Hawkins
import java.util.Scanner;

class CS1extra3
{
    public static void main (String args[])
    {
        //Scanner
        Scanner taco = new Scanner(System.in);
        //Prompt & If/Else Statement
        System.out.println("1. Square");
        System.out.println("2. Triangle");
        System.out.println("Please type a number above: ");
        int shape = taco.nextInt();
        if (shape==1)
        {
            System.out.println("What is the length of its sides?");
            float num1 = taco.nextFloat();
            double num2 = num1*num1;
            System.out.println("The area of your square is "+num2+".");
        }
        else if (shape==2)
        {
            System.out.println("What is the length of the base?");
            float num3 = taco.nextFloat();
            System.out.println("What is the height?");
            float num4 = taco.nextFloat();
            double num5 = num3*num4;
            double num6 = num5*0.5;
            System.out.println("The area of your triangle is "+num6+".");
        }
        else
        {
            System.out.println("Not Valid");
        }
        taco.close();
    }
}