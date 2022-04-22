import java.util.*;
import java.lang.*;

public class P69A
{


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of forces: ");
        int forces = input.nextInt();
        
        calculate(forces, input);
    }

    public static void calculate(int forces, Scanner xyz)
    {

        double XVectors = 0;
        double YVectors = 0;
        double ZVectors = 0;

        for(int i = 1; i <= forces; i++)
        {
            System.out.println("Vectors of force " + i);

            System.out.println("Enter vector x: ");
            double xv = xyz.nextDouble();
            XVectors = XVectors + xv;

            System.out.println("Enter vector y: ");
            double yv = xyz.nextDouble();
            YVectors = YVectors + yv;

            System.out.println("Enter vector z: ");
            double zv = xyz.nextDouble();
            ZVectors = ZVectors + zv;
        }

        checkEquilibrium(XVectors,YVectors,ZVectors);

    }

    public static String checkEquilibrium(double X, double Y, double Z)
    {
        if ((X + Y + Z) == 0)
        {
            System.out.println("YES");
            return "Yes";
        }
        else
        {
            System.out.println("NO");
            return "No";
        }
    }
}
