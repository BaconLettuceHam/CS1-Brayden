import java.util.Scanner;

class subtracttwo
{
    public static int Mult(int num1, int num2){
        return num1*num2;
    }
    public static void main (String args[])
    {
        Scanner finput = new Scanner(System.in);
        System.out.println("Choose your first number: ");
        int first = finput.nextInt();
        
        System.out.println("Choose your second number: ");
        int second = finput.nextInt();

        int product=Mult(first,second);
        System.out.println("The product of "+first+" and "+second+" is "+product);
    }
}