import java.util.Scanner;
public class calculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.println("Addition '+'\nSubtraction '-'\nMultiplication '*'\nDivision '/'\n");
        System.out.print("Choose the operation to be performed: ");
        String op = sc.next();
        switch(op)
        {
            case "+":
                System.out.print("Sum = "+(n1+n2));
                break;
            case "-":
                System.out.print("Difference = "+(n1-n2));
                break;
            case "*":
                System.out.print("Product = "+(n1*n2));
                break;
            case "/":
                System.out.print("Quotient = "+(n1/n2));
                break;
            default:
                System.out.print("Enter a valid operation");
        }
    }
}
