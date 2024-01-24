//Brayden Hawkins
import java.util.Scanner;

class CS1extra
{
    public static void main(String args[])
    {
        //Scanner
        Scanner age = new Scanner(System.in);
        //Prompt & If/Else Statement
        System.out.println("What is your age: ");
        int youth = age.nextInt();
        if (youth>=18)
        {
            System.out.println("You can vote");
        }
        else if (youth==17)
        {
            System.out.println("You can learn to drive.");
        }
        else if (youth==16)
        {
            System.out.println("You can buy a lottery ticket.");
        }
        else
        {
            System.out.println("You can go trick-or-treating");
        }
        age.close();
    }
}