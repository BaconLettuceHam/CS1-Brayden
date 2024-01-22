//Brayden Hawkins
import java.util.Scanner;

class CS1SI
{
    public static void main(String args[])
    {
        //Scanner
        Scanner mony = new Scanner(System.in);
        //Prompt and Arithmetic
        System.out.println("What is the Principal?: ");
        int pr = mony.nextInt();
        System.out.println("What is the rate? (Include a whole number that represents the percentage.): ");
        int rat1 = mony.nextInt();
        double rat2 = rat1*0.01;
        System.out.println("How many years will it be interested?: ");
        int time = mony.nextInt();
        double IR1 = pr*rat2*time;
        System.out.println("The interest rate is "+IR1+".");
    }
}