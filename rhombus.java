import java.util.Scanner;
public class rhombus
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of first diagonal: ");
        float d1 = sc.nextFloat();
        System.out.print("Enter length of second diagonal: ");
        float d2 = sc.nextFloat();
        float area = (d1*d2)/2;
        System.out.println("Area of Rhombus = "+area);
    }
}
