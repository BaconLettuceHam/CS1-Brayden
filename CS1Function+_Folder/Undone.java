import java.util.Scanner;

class subtracttwo
{
    public static void Undone(String word){ 
        String drow="";
        for (int i=word.length()-1; i>=0;i--)
        {
            char cr=word.charAt(i);
            drow=drow+cr;
        }
        System.out.println(drow);
    }
    public static void main (String args[])
    {
        Scanner finput = new Scanner(System.in);
        System.out.println("Choose a word: ");
        String sign = finput.nextLine();

        Undone(sign);
        

    }
}