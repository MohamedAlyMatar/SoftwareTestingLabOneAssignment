import java.util.*;
import java.lang.*;

public class P4A
{
    public static String check(int weight)
    {
        if(weight < 0)
        {
            throw new IllegalArgumentException("Weight cannot be a negative number");
        }
        else if(weight == 2)
        {
            System.out.println("No");
            return "No";
        }
        else if(weight%2 == 0)
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight of the watermelon: ");
        int weight = input.nextInt();
        check(weight);
    }
}
