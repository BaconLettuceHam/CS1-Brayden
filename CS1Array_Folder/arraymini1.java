import java.util.Scanner;

class arraymini1
{
    public static void main (String args[])
    {
        //Scanner
        Scanner finput = new Scanner(System.in);
        System.out.println("Choose your first number: ");
        int num1 = finput.nextInt();
        
        System.out.println("Choose your second number: ");
        int num2 = finput.nextInt();

        System.out.println("Choose your third number: ");
        int num3 = finput.nextInt();

        System.out.println("Choose your fourth number: ");
        int num4 = finput.nextInt();

        System.out.println("Choose your fifth number: ");
        int num5 = finput.nextInt();

        int num6=0;
        //Array
        int[] numN={num1,num2,num3,num4,num5};
        for (int i=4;i>=0;i--)
        {
            num6=num6+numN[i];
        }
        System.out.println("The sum is "+num6);
        finput.close();
    }
}
