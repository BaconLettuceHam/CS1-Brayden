//Source for reference: https://www.geeksforgeeks.org/check-if-a-value-is-present-in-an-array-in-java/
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
class array1
{
    private static boolean check(int[] numX, int num0)
    {
        // check if the specified element
        // is present in the array or not
        // using Linear Search method
        boolean test = false;
        for (int element : numX) {
            if (element == num0) {
                test = true;
                break;
            }
        }
        return test;
    }
    public static void main (String args[])
    {
        Scanner finput = new Scanner(System.in);
        int[] numX=new int [15];
        int[] numY=new int [15];
        int num1=16;
        for(int i=0;i<=14;i++)
        {
            num1=num1-1;
            System.out.print("Enter a number ("+num1+" times remaining): ");
            int num0 = finput.nextInt();
            if (check(numX, num0)==true)
            {
                numY[i]=num0;
            }
            else
            {
                numX[i]=num0;
            }
        }
        for (int e=0;e<=numX.length-1;e++)
        {
            if (numX[e]==0)
            {

            }
            else
            {
                if (e == numX.length-1)
                {
                    System.out.println(numX[e]);
                } 
                else 
                {
                    System.out.print(numX[e]+", ");
                }
            }
        }
        finput.close();
    }
}