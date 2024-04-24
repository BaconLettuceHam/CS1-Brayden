import java.util.Scanner;

class subtracttwo
{
    public static void Plural(int prime){ 
            int kyle=1;
            for(int i=prime-1;i>=1;i--)
            {
                kyle=prime%i;
                if(kyle==0)
                {
                    System.out.println("Your number isn't prime");
                    break;
                }
            }
            if(kyle!=0)
            {
            System.out.println("Your number is prime");
            }
        }
    public static void main (String args[])
    {
        Scanner finput = new Scanner(System.in);
        System.out.println("Choose a number: ");
        int sign = finput.nextInt();

        Plural(sign);
        

    }
}