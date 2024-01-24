//Brayden Hawkins
import java.util.Scanner;

class CS1circle
{
    public static void main (String args[])
    {
        //Scanner
        Scanner tart = new Scanner(System.in);
        //Prompt & Arithmetic
        System.out.println("What is the radius?: ");
        float r = tart.nextFloat();
        double r2 = r*r;
        double area = 3.14*r2;
        System.out.println("The area of your circle is "+area+".");
        tart.close();
    }
}