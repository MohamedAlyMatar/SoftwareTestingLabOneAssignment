import java.util.*;
import java.lang.*;

public class P69A
{
    public static String checkEquilibrium(double X, double Y, double Z)
    {
        if ((X + Y + Z) == 0)
        {
            System.out.println("Yes");
            return "Yes";
        }
        else
        {
            System.out.println("No");
            return "No";
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of forces: ");
        int forces = input.nextInt();

        double XVectors = 0;
        double YVectors = 0;
        double ZVectors = 0;

        for(int i = 1; i <= forces; i++)
        {
            System.out.println("Vectors of force " + i);

            Scanner x = new Scanner(System.in);
            System.out.println("Enter vector x: ");
            double xv = x.nextDouble();
            XVectors = XVectors + xv;

            Scanner y = new Scanner(System.in);
            System.out.println("Enter vector y: ");
            double yv = y.nextDouble();
            YVectors = YVectors + yv;

            Scanner z = new Scanner(System.in);
            System.out.println("Enter vector z: ");
            double zv = z.nextDouble();
            ZVectors = ZVectors + zv;
        }

        checkEquilibrium(XVectors,YVectors,ZVectors);
    }
}
