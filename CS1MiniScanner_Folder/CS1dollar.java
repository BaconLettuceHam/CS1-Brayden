//Brayden Hawkins
import java.util.Scanner;

class CS1dollar
{
    public static void main (String args[])
    {
        //Scanner
        Scanner money = new Scanner(System.in);
        //Prompt and Arithmetic
        System.out.println("How many dollars do you want to convert to Euros?: ");
        float dollar = money.nextFloat();
        double euro = dollar*0.92;
        System.out.println("You have "+euro+" Euros.");
        money.close();
    }
}