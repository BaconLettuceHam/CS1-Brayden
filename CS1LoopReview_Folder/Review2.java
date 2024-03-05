import java.util.Scanner;
import java.util.Random;

class Review1
{
    public static void main (String args[])
    {
        //Scanner
        Scanner finput = new Scanner(System.in);
        Random  maybe = new Random();
        int dragon = 100;
        int hero = 100;
        System.out.println("DEFEAT THE DRAGON!!!!!");
        while  (dragon>0)
        {
            System.out.println("What would you like to do? Attack(1) Heal(2)");
            int choice = finput.nextInt();
            if (choice==1)
            {
                int dice = maybe.nextInt(20);
                int roll = dice+1;
                System.out.println(roll);
                if (roll==1)
                {
                    System.out.println("PITIFUL: you gently touch the dragon and give it a little puppy scratch.");
                }
                else if (2<=roll&&roll<=5)
                {
                    System.out.println("PATHETIC: you graze the dragon, giving it a mild scab.");
                }
                else if (6<=roll&&roll<=10)
                {
                    System.out.println("OK: you stab the dragon, giving it a scar.");
                }
                else if (11<=roll&&roll<=15)
                {
                    System.out.println("GOOD: you were able to get a deep cut on the dragon.");
                }
                else if (16<=roll&&roll<=19)
                {
                    System.out.println("GREAT: you slice the dragon, giving it a big gash.");
                }
                else
                {
                    System.out.println("CRITICAL: you strike the dragon dead on with your sword!");
                }
                dragon=dragon-roll;
                System.out.println("Dragon HP: "+dragon);
            }
            else if (choice==2)
            {
                int potion = maybe.nextInt(11);
                int buff = potion+10;
                System.out.println("You have healed "+buff+" HP.");
                hero = hero+buff;
                System.out.println("Hero HP: "+hero);
            }
            else
            {
                System.out.println("You stand there. Doing nothing.");
            }
            int slash = maybe.nextInt(20);
            int claw = slash+1;
            System.out.println("The dragon attacks you dealing " +claw+" HP.");
            hero=hero-claw;
            System.out.println("Hero HP: "+hero);
            if (dragon<=0)
            {
                System.out.println("You have slain the dragon. Good Job.");
            }
            else if (hero<=0)
            {
                System.out.println("You died. BooHoo.");
                dragon=0;
            }
            else
            {
                //Pass
            }
            
        }
        finput.close();
    }
}