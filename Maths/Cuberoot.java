import java.util.*;

class Cuberoot
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        
        double c=Math.cbrt(a);
        System.out.println("The cuberoot is "+c);
    }
}
