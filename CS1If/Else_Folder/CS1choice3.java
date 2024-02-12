import java.util.Scanner;

class CS1choice3
{
    public static void main (String args[])
    {
        //Scanner
        Scanner choice = new Scanner(System.in);
        //Prompt
        System.out.println("What is the percentage of your grade?: ");
        int num1 = choice.nextInt();
        //If/else
        if (num1>=90)
        {
            System.out.println("You got a A.");
        }
        else if (90>num1&&num1>=80)
        {
            System.out.println("You got a B");
        }
        else if (80>num1&&num1>=70)
        {
            System.out.println("You got a C");
        }
        else if (70>num1&&num1>=60)
        {
            System.out.println("You got a D");
        }
        else
        {
            System.out.println("You got a F");
        }
        choice.close();
    }
}