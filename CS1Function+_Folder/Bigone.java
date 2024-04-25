import java.util.Scanner;

class subtracttwo
{
    public static void Big(int one, int two, int three, int four, int five, int six){ 
            int[] numX={one,two,three,four,five};
            for (int i=4;i>=0;i--)
        {
            if (six<numX[i])
            {
                six=numX[i];
            }
        }
        System.out.println("The biggest number entered was "+six);
        }
    public static void main (String args[])
    {
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
        Big(num1,num2,num3,num4,num5,num6);
        

    }
}