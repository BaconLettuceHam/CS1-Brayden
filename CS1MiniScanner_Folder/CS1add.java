//Brayden Hawkins
import java.util.Scanner;

class CS1add
{
    public static void main (String args[])
    {
        //Scanner
        Scanner add = new Scanner(System.in);
        //Prompt and Arithmetic
        System.out.println("Choose a number: ");
        float num1 = add.nextFloat();
        System.out.println("Choose another number to add to your previous number: ");
        float num2 = add.nextFloat();
        float num3 = num1+num2;
        System.out.println("The result is: "+num3+".");
        add.close();
    }
}