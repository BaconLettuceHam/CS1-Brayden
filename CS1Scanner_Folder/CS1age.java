import java.util.Scanner;

class CS1age
{
    public static void main(String args[])
    {
        //Scanner
        Scanner old = new Scanner(System.in);
        //Prompt and Arithmetic
        System.out.println("What is your age?: ");
        int age = old.nextInt();
        int num1 = age-10;
        int num2 = age+10;
        int num3 = age*10;
        //Answers
        System.out.println("Ten years ago, you were "+num1+".");
        System.out.println("Ten years later, you will be "+num2+".");
        System.out.println("If each year was a decade, you would've been "+num3+".");
    }
}