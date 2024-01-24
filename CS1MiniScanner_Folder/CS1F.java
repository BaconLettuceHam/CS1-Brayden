//Brayden Hawkins
import java.util.Scanner;

class CS1F
{
    public static void main(String args[])
    {
        //Scanner
        Scanner fahr=new Scanner(System.in);
        //Prompt and Arithmetic
        System.out.println("What is the Fahrenheit?: ");
        int temp = fahr.nextInt();
        //F to C
        int numM= temp-32;
        double numC= numM*5/9;
        System.out.println("The celcius is: "+numC+".");
        fahr.close();
    }
}