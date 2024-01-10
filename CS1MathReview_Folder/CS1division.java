//Brayden Hawkins
//1/8/2024
//Computer Science 1
//displays the quotient and remainder of a simple division problem

class CS1division
{
    public static void main (String args[])
    {
        //assigning values
        int num1 = 85;
        int num2 = 9;
        //quotinent
        double num3 = num1/num2;
        double num4 = Math.floor(num3);
        //remainder
        double num5 = num1%num2;
        //results
        System.out.println("Quotinent: "+num4);
        System.out.println("Remainder: "+num5);
    }
}