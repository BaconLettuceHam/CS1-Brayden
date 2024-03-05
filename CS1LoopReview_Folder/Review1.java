import java.util.Scanner;

class Review1
{
    public static void main (String args[])
    {
        //Scanner
        Scanner finput = new Scanner(System.in);
        System.out.println("Choose a number for a multiplication table: ");
        int num1 = finput.nextInt();
        for (int i=0;i<=15;i++)
        {
            int num2 = num1*i;
            System.out.println(num1+" times "+i+" equals "+num2);
        }
        finput.close();
    }
}