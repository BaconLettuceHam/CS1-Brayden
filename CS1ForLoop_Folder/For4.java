import java.util.Scanner;

class For4
{
    public static void main (String args[])
    {
        //Scanner
        Scanner finput =  new Scanner(System.in);
        int i=1;
        boolean anna = true;
        int num2=0;
        int num3=0;
        int num4=0;
        while (i==1){
            System.out.println("Enter a whole number: ");
            int num1 = finput.nextInt();
            
            if (anna==true)
            {
                num2=num1;
                num3=num1;
            }
            else
            {
                if (num1>num2)
                {
                    num2=num1;
                }
                else if (num1<num3)
                {
                    num3=num1;
                }
                else
                {
                    num4=num1;
                }
            }
            
            anna = false;
            System.out.println("Do you want another number? (Press 1)");
            i = finput.nextInt();
        }
        System.out.println("Your largest value was "+num2);
        System.out.println("Your smallest value was "+num3);
        finput.close();
    }
}