import java.util.Scanner;

class For1
{
    public static void main (String args[])
    {
        //Scanner
        Scanner finput =  new Scanner(System.in);
        System.out.println("Enter a number for  a factorial: ");
        int num1 = finput.nextInt();
        int num2 = 1;
        int num3 = 0;
        //for loop
        for (int i = num1; i >= 1; i--)
        {
            num2 = i*num2;
        }
        System.out.println(num2);
    }
}