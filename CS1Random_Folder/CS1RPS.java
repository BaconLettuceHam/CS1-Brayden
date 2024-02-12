import java.util.Scanner;
import java.util.Random;

class CS1choice5
{
    public static void main (String args[])
    {
        //Scanner & Random
        Scanner choice = new Scanner(System.in);
        Random maybe = new Random();
        //Prompt
        int forgor = maybe.nextInt(3);
        System.out.println("Choose your play: Rock(1), Paper(2), Scissors(3)");
        int play = choice.nextInt();
        //If/else
        if (forgor==0)
        {
            System.out.println("I chose Rock.");
            if (play==1)
            {
                System.out.println("It's a tie");
            }
            else if (play==2)
            {
                System.out.println("You win");
            }
            else if (play==3)
            {
                System.out.println("You lose");
            }
            else
            {
                System.out.println("Not valid.");
            }
        }
        else if (forgor==1)
        {
            System.out.println("I chose Paper.");
            if (play==1)
            {
                System.out.println("You lose");
            }
            else if (play==2)
            {
                System.out.println("It's a tie");
            }
            else if (play==3)
            {
                System.out.println("You win");
            }
            else
            {
                System.out.println("Not Valid.");
            }
        }
        else
        {
            System.out.println("I chose Scissors.");
            if (play==1)
            {
                System.out.println("You win");
            }
            else if (play==2)
            {
                System.out.println("You lose");
            }
            else if (play==3)
            {
                System.out.println("It's a tie");
            }
            else
            {
                System.out.println("Not valid");
            }
        }
        choice.close();
    }
}