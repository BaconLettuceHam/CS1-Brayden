import java.util.Scanner;
import java.util.Random;

class CS1RPS
{
    public static void main (String args[])
    {
        //Scanner & Random
        Scanner choice = new Scanner(System.in);
        Random maybe = new Random();
        //Prompt
        int forgor = maybe.nextInt(2);
        System.out.println("Heads(1) or Tails(2)");
        int play = choice.nextInt();
        //If/else
        if (play==1)
        {
            System.out.println("You picked Heads");
            if (forgor==0)
            {
                System.out.println("Heads, You win.");
            }
            else
            {
                System.out.println("Tails, you lose.");
            }
        }
        else if (play==2)
        {
                System.out.println("You picked Tails");
                if (forgor==0)
                {
                    System.out.println("Heads, You lose.");
                }
                else
                {
                    System.out.println("Tails, You win.");
                }
        }
        else
        {
            System.out.println("No");
        }
        choice.close();
    }
}