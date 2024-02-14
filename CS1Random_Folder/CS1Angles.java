import java.util.Scanner;

class CS1Angles
{
    public static void main (String args[])
    {
        //Scanner
        Scanner choice = new Scanner(System.in);
        //Prompt
        System.out.println("What is the degrees of the first angle of your triangle");
        int tri1 = choice.nextInt();
        System.out.println("What is the degrees of the second angle of your triangle");
        int tri2 = choice.nextInt();
        System.out.println("What is the degrees of the third angle of your triangle");
        int tri3 = choice.nextInt();
        //If/else
        if (tri1==tri2&&tri1==tri3)
        {
            System.out.println("Your triangle is equalaterial.");
        }
        else if (tri1==tri2||tri1==tri3||tri2==tri3)
        {
            System.out.println("Your triangle is isosceles.");
        }
        else
        {
            System.out.println("Your triangle is scalene.");
        }
        choice.close();
    }
}