import java.util.Scanner;

class subtracttwo
{
    public static void stars(int num1){
        for(int i=num1; i>=1; i--)
        {
            System.out.print("*");
        }
    }
    public static void main (String args[])
    {
        Scanner finput = new Scanner(System.in);
        System.out.println("How many stars do you want?: ");
        int seeing=finput.nextInt();
        
        stars(seeing);
    }
}