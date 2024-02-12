import java.util.Scanner;

class CS1choice3
{
    public static void main (String args[])
    {
        //Scanner
        Scanner choice = new Scanner(System.in);
        //Prompt
        System.out.println("Enter a letter");
        String char1 = choice.nextLine();
        //If/else
        if (char1.equals("a"))
        {
            System.out.println("Your letter is a vowel");
        }
        else if (char1.equals("e"))
        {
            System.out.println("Your letter is a vowel");
        }
        else if (char1.equals("i"))
        {
            System.out.println("Your letter is a vowel");
        }
        else if (char1.equals("o"))
        {
            System.out.println("Your letter is a vowel");
        }
        else if (char1.equals("u"))
        {
            System.out.println("Your letter is a vowel");
        }
        else
        {
            System.out.println("Your letter is a consonant");
        }
        choice.close();
    }
}