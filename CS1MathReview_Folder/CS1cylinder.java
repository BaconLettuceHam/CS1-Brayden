//Brayden Hawkins
//1/8/2024
//Computer Science 1
//finds the volume and surface area of a cylinder

class CS1cylinder
{
    public static void main (String args[])
    {
        //assigning main variables
        int r=5;
        int h=8;
        //volume
        int r2=r*r;
        double vol=3.14*r2*h;
        //surface area
        int rho=r+h;
        double sa=2*3.14*r*rho;
        //answers
        System.out.println("Volume: "+ vol);
        System.out.println("Surface Area: "+ sa);
    }
}