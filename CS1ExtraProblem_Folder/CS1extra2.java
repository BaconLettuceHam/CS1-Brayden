//Brayden Hawkins
import java.util.Scanner;

class CS1extra2
{
    public static void main(String args[])
    {
        //Scanner
        Scanner uno = new Scanner(System.in);
        //Prompt and If/Else Statement
        System.out.println("Enter a number: ");
        int num1 = uno.nextInt();
        if (num1<10)
        {
            System.out.println("Too low");
        }
        else if (20>num1&&num1>10)
        {
            System.out.println("Correct");
        }
        else
        {
            System.out.println("Too high");
        }
        uno.close();
    }
}