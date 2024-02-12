import java.util.Scanner;

class CS1choice1
{
    public static void main (String args[])
    {
        //Scanner
        Scanner choice = new Scanner(System.in);
        //Prompt
        System.out.println("Enter a number: ");
        int num1 = choice.nextInt();
        //If/else
        int num2 = num1%2;
        if (num2==1)
        {
            System.out.println("Your number is odd.");
        }
        else
        {
            System.out.println("Your number is even.");
        }
        choice.close();
    }
}