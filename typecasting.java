import java.util.Scanner;
public class typecasting
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        int num=Integer.parseInt(str);
        System.out.println("The number is: "+num);
    }
}
