import java.util.Scanner;

class subtracttwo
{
    public static void Fibon(int acci){
        int then=1;
        int hint=0;
        int tint=0;
        for (int i=acci;i>=2;i--)
        {
            tint=then;
            then=then+hint;
            hint=tint;
        }
        System.out.println(then);
        }
    public static void main (String args[])
    {
        Scanner finput = new Scanner(System.in);
        System.out.println("Choose a number: ");
        int sign = finput.nextInt();

        Fibon(sign);
        

    }
}