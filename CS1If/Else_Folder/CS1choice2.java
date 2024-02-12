import java.util.Scanner;

class CS1choice2
{
    public static void main (String args[])
    {
        //Scanner
        Scanner choice = new Scanner(System.in);
        //Prompt
        System.out.println("What is your age?: ");
        int num1 = choice.nextInt();
        //If/else
        if (num1<13)
        {
            System.out.println("You are a child.");
        }
        else if (19>num1&&num1>=13)
        {
            System.out.println("You are a teenager.");
        }
        else if (65>num1&&num1>=19)
        {
            System.out.println("You are a adult.");
        }
        else if (108>num1&&num1>=65)
        {
            System.out.println("You are a Senior citizen.");
        }
        else
        {
            System.out.println("You are dead.");
        }
        choice.close();
    }
}