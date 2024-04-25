import java.util.Scanner;

class subtracttwo
{
    public static void Times(int mult){
        int then=1;
        for (int i=mult;i>=1;i--)
        {
            then=then*i;
        }
        System.out.println(then);
        }
    public static void main (String args[])
    {
        Scanner finput = new Scanner(System.in);
        System.out.println("Choose a number: ");
        int sign = finput.nextInt();

        Times(sign);
        

    }
}