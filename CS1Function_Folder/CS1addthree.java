import java.util.Scanner;

class subtracttwo
{
    public static int Plus(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public static void main (String args[])
    {
        Scanner finput = new Scanner(System.in);
        System.out.println("Choose your first number: ");
        int first = finput.nextInt();
        
        System.out.println("Choose your second number: ");
        int second = finput.nextInt();

        System.out.println("Choose your third number: ");
        int third = finput.nextInt();

        int sum=Plus(first,second,third);
        System.out.println("The sum of "+first+" and "+second+" and "+third+" is "+sum);
    }
}