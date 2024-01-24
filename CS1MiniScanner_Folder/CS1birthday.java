//Brayden Hawkins
import java.util.Scanner;

class CS1birthday
{
    public static void main (String args[])
    {
        //Scanner
        Scanner age = new Scanner(System.in);
        //Prompt and Arithmetic
        System.out.println("When were you born?: ");
        int num1 = age.nextInt();
        int num2 = 2024-num1;
        System.out.println("You are around "+num2+" years old.");
        age.close();
    }
}