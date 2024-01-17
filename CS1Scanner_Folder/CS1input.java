import java.util.Scanner;

class CS1input
{
    public static void main(String args[])
    {
        //Scanners
        Scanner amy = new Scanner(System.in);
        Scanner bob = new Scanner(System.in);
        Scanner criss = new Scanner(System.in);
        //Prompts and Strings
        System.out.println("Enter your first name: ");
        String first = amy.nextLine();
        System.out.println("Enter your middle name: ");
        String second = bob.nextLine();
        System.out.println("Enter your last name: ");
        String third = criss.nextLine();
        //output
        System.out.println("Hello, "+first+" "+second+" "+third+".");
        //Closing Scanners
        amy.close();
        bob.close();
        criss.close();
    }
}