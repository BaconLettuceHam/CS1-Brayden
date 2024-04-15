import java.util.Scanner;

class subtracttwo
{
    public static String name(String str1){
        return ("Hello "+str1);
    }
    public static void main (String args[])
    {
        Scanner finput = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String signature=finput.nextLine();
        
        String answer=name(signature);
        System.out.println(answer);
    }
}