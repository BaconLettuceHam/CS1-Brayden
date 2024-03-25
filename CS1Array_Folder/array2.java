import java.util.Scanner;

class array1
{
    private static void check(int[] numX, int numN)
    {
        boolean test = false;
        for (int element : numX) 
        {
            if (element==numN)
            {
                test=true;
                break;
            }
        }
    }
    public static void main (String args[])
    {
        Scanner finput = new Scanner(System.in);
        int[] numX={}
        int[] numY={}
        for(i=1;i<=25;i++)
        {
            System.out.print("Enter a number ("+i+" times remaining): ")
            int num0 = finput.nextInt()
            if (numX,numN)
            {
                numY = Arrays.copyOf(numY, numY.length+1);
                numY[numY.length] = num0; 
            }
            else
            {
                numX = Arrays.copyOf(numX, numX.length+1);
                numX[numX.length] = num0;
            }
        }
    }
}