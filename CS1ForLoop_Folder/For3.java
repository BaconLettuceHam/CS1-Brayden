import java.util.Scanner;

class For3
{
    public static void main (String args[])
    {
        //Scanner
        Scanner finput =  new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        int num1 = finput.nextInt();
        //for loop
        for(int i=0; i<=num1; i+=2)
        {
            System.out.println(i);
        }
        finput.close();
    }
}