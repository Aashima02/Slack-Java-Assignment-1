import java.util.Scanner;
public class compare_num
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        compare(a,b);
    }
    public static void compare(int n1,int n2)
    {
        if(n1 > n2)
        {
            System.out.println(n1+" greater than "+n2);
        }
        else if(n2 > n1)
        {
            System.out.println(n2+" greater than "+n1);
        }
        else
        {
            System.out.println("Both the numbers are equal");
        }
    }
}
