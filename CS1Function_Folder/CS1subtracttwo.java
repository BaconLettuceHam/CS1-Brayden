import java.util.Scanner;

class subtracttwo
{
    public static int Minus(int num1, int num2){
        return num1-num2;
    }
    public static void main (String args[])
    {
        Scanner finput = new Scanner(System.in);
        System.out.println("Choose your first number: ");
        int first = finput.nextInt();
        
        System.out.println("Choose your second number: ");
        int second = finput.nextInt();

        int difference=Minus(first,second);
        System.out.println("The difference between "+first+" and "+second+" is "+difference);
    }
}
