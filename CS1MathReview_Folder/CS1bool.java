//Brayden Hawkins
//1/10/2024
//Computer Science 1
//Checks wether a number is divisable by 7

class CS1bool
{
    public static void main (String args[])
    {
        //assigning variables
        int num1=48;
        int num2=7;
        //checking
        System.out.println(num1);
        int num3 = num1%num2;
        if (num3==0)
        {
            System.out.println("This number is divisable by seven");
        }
        else
        {
            System.out.println("This number is not divisable by seven");
        }
    }
}