import java.util.Scanner;

class Review3
{
    public static void main (String args[])
    {
        //Scanner
        Scanner finput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = finput.nextInt();
        int num3 = 0;
        while (num1>0)
        {
            int num2=num1%10;
            num3 = num3+num2;
            int num4 = num1-num2;
            num1 = num4/10;
        }
        System.out.println("The sum of your number's digits are "+num3);
        finput.close();
    }
}