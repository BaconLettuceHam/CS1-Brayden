import java.util.Scanner;
import java.util.Random;

class For5
{
    public static void main (String args[])
    {
        //Scanner
        Scanner finput = new Scanner(System.in);
        Random  maybe = new Random();
        int  guess = maybe.nextInt(101);
        int i=0;
        while (i!=guess)
        {
            System.out.println("Guess a whole number: ");
            i = finput.nextInt();
            if (i>guess)
            {
                System.out.println("Too high");
            }
            else if (i<guess)
            {
                System.out.println("Too low");
            }
            else if (i==guess)
            {
                System.out.println("Correct");
            }
            else
            {
                System.out.println("Invalid");
            }
        }
        finput.close();

    }
}