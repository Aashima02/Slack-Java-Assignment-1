import java.util.Scanner;
public class multiplication_table
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i;
        System.out.println("Multiplication table of "+num+": ");
        for(i=1;i<=12;i++)
        {
            int prod = num*i;
            System.out.println(num+" x "+i+" = "+prod);
        }
    }
}
