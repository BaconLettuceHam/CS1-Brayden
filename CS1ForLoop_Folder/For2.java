import java.util.Scanner;

class For2
{
    public static void main (String args[])
    {
        //Scanner
        Scanner finput =  new Scanner(System.in);
        String drow = "";
        System.out.println("Enter a word to reverse: ");
        String word = finput.nextLine();
        //for loop
        for (int i=word.length()-1; i>=0;i--)
        {
            char cr=word.charAt(i);
            drow=drow+cr;
        }
        System.out.println(drow);
        finput.close();
    }
}