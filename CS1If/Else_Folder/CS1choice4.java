import java.util.Scanner;

class CS1choice4
{
    public static void main (String args[])
    {
        //Scanner
        Scanner choice = new Scanner(System.in);
        //Prompt
        System.out.println("What year is it?: ");
        int num1 = choice.nextInt();
        //If/else
        int num2=num1%4;
        if (num2==0)
        {
            System.out.println("It's a leap year.");
        }
        else
        {
            System.out.println("It's not a leap year.");
        }
        choice.close();
    }
}